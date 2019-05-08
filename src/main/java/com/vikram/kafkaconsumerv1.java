package com.vikram;

import java.util.*;
import org.apache.kafka.clients.consumer.*;


public class kafkaconsumerv1{

    public static void main(String[] args) throws Exception{

        String topicName = "avro";

        String groupName = "lumendata";
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", groupName);
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "io.confluent.kafka.serializers.KafkaAvroDeserializer");
        props.put("schema.registry.url", "http://localhost:8081");
        props.put("specific.avro.reader", "true");

        KafkaConsumer<String, Customer> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList(topicName));
        try{
            while (true){
                ConsumerRecords<String, Customer> records = consumer.poll(100);
                for (ConsumerRecord<String, Customer> record : records){
                    System.out.println("id=" + record.value().getID() + ","
                            + "account:" + record.value().getAccount() + ","
                            + "address:" + record.value().getAddress() + ","
                            + "contact:" + record.value().getContact());
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            consumer.close();
        }
    }

}