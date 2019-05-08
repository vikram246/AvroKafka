package com.vikram;

import java.util.Properties;

import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.util.*;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;
import java.lang.String;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;


import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;


public class kafkaproducerv1 {

    public static void main(String[] args) {

/**
        Properties properties = new Properties();
        // normal producer
        properties.setProperty("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094");
        properties.setProperty("acks", "1");
        properties.setProperty("retries", "10");
        // avro part
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", "http://localhost:8081");


        KafkaProducer<String, Customer> KafkaProducer = new KafkaProducer<String, Customer>(properties);
        String topic = "Multibrokercluster";



        Customer customer = Customer.newBuilder()
                .setID(12)
                .setContact("vikram")
                .setAccount("maruti")
                .setAddress("delhi")
                .build();
        ProducerRecord<String,Customer> producerRecord = new ProducerRecord<String, Customer>(topic, customer
        );

        KafkaProducer.send(producerRecord, new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (e == null){
                    System.out.println("Success");
                    System.out.println(recordMetadata.toString());
                } else {
                    e.printStackTrace();
                }
            }
        });

        KafkaProducer.flush();
        KafkaProducer.close();

    }
}

         */


        String topicName = "avro";
        String msg;

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
        props.put("schema.registry.url", "http://localhost:8081");

        Producer<String, Customer> producer = new KafkaProducer <>(props);
        Customer cr = new Customer();
        try{
            cr.setID(21);
            cr.setAccount("toyota");
            cr.setContact("vikram");
            cr.setAddress("delhi");

            producer.send(new ProducerRecord<String, Customer>(topicName,cr.getAccount().toString(),cr)).get();

            System.out.println("Hi....Your Avro message produced Successfully");
        }
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
        finally{
            producer.close();
        }

    }
}