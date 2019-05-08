/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.vikram;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -6666211555423057275L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"com.vikram\",\"fields\":[{\"name\":\"ID\",\"type\":\"int\",\"doc\":\"id of cus\"},{\"name\":\"contact\",\"type\":\"string\",\"doc\":\"contact of cus\"},{\"name\":\"account\",\"type\":\"string\",\"doc\":\"Account for cus\"},{\"name\":\"address\",\"type\":\"string\",\"doc\":\"address of cus\"}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Customer> ENCODER =
            new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<Customer> DECODER =
            new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     */
    public static BinaryMessageDecoder<Customer> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     */
    public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
    }

    /** Serializes this Customer to a ByteBuffer. */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /** Deserializes a Customer from a ByteBuffer. */
    public static Customer fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /** id of cus */
    @Deprecated public int ID;
    /** contact of cus */
    @Deprecated public java.lang.CharSequence contact;
    /** Account for cus */
    @Deprecated public java.lang.CharSequence account;
    /** address of cus */
    @Deprecated public java.lang.CharSequence address;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Customer() {}

    /**
     * All-args constructor.
     * @param ID id of cus
     * @param contact contact of cus
     * @param account Account for cus
     * @param address address of cus
     */
    public Customer(java.lang.Integer ID, java.lang.CharSequence contact, java.lang.CharSequence account, java.lang.CharSequence address) {
        this.ID = ID;
        this.contact = contact;
        this.account = account;
        this.address = address;
    }

    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return ID;
            case 1: return contact;
            case 2: return account;
            case 3: return address;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: ID = (java.lang.Integer)value$; break;
            case 1: contact = (java.lang.CharSequence)value$; break;
            case 2: account = (java.lang.CharSequence)value$; break;
            case 3: address = (java.lang.CharSequence)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'ID' field.
     * @return id of cus
     */
    public java.lang.Integer getID() {
        return ID;
    }

    /**
     * Sets the value of the 'ID' field.
     * id of cus
     * @param value the value to set.
     */
    public void setID(java.lang.Integer value) {
        this.ID = value;
    }

    /**
     * Gets the value of the 'contact' field.
     * @return contact of cus
     */
    public java.lang.CharSequence getContact() {
        return contact;
    }

    /**
     * Sets the value of the 'contact' field.
     * contact of cus
     * @param value the value to set.
     */
    public void setContact(java.lang.CharSequence value) {
        this.contact = value;
    }

    /**
     * Gets the value of the 'account' field.
     * @return Account for cus
     */
    public java.lang.CharSequence getAccount() {
        return account;
    }

    /**
     * Sets the value of the 'account' field.
     * Account for cus
     * @param value the value to set.
     */
    public void setAccount(java.lang.CharSequence value) {
        this.account = value;
    }

    /**
     * Gets the value of the 'address' field.
     * @return address of cus
     */
    public java.lang.CharSequence getAddress() {
        return address;
    }

    /**
     * Sets the value of the 'address' field.
     * address of cus
     * @param value the value to set.
     */
    public void setAddress(java.lang.CharSequence value) {
        this.address = value;
    }

    /**
     * Creates a new Customer RecordBuilder.
     * @return A new Customer RecordBuilder
     */
    public static com.vikram.Customer.Builder newBuilder() {
        return new com.vikram.Customer.Builder();
    }

    /**
     * Creates a new Customer RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new Customer RecordBuilder
     */
    public static com.vikram.Customer.Builder newBuilder(com.vikram.Customer.Builder other) {
        return new com.vikram.Customer.Builder(other);
    }

    /**
     * Creates a new Customer RecordBuilder by copying an existing Customer instance.
     * @param other The existing instance to copy.
     * @return A new Customer RecordBuilder
     */
    public static com.vikram.Customer.Builder newBuilder(com.vikram.Customer other) {
        return new com.vikram.Customer.Builder(other);
    }

    /**
     * RecordBuilder for Customer instances.
     */
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
            implements org.apache.avro.data.RecordBuilder<Customer> {

        /** id of cus */
        private int ID;
        /** contact of cus */
        private java.lang.CharSequence contact;
        /** Account for cus */
        private java.lang.CharSequence account;
        /** address of cus */
        private java.lang.CharSequence address;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.vikram.Customer.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.ID)) {
                this.ID = data().deepCopy(fields()[0].schema(), other.ID);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.contact)) {
                this.contact = data().deepCopy(fields()[1].schema(), other.contact);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.account)) {
                this.account = data().deepCopy(fields()[2].schema(), other.account);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.address)) {
                this.address = data().deepCopy(fields()[3].schema(), other.address);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Creates a Builder by copying an existing Customer instance
         * @param other The existing instance to copy.
         */
        private Builder(com.vikram.Customer other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.ID)) {
                this.ID = data().deepCopy(fields()[0].schema(), other.ID);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.contact)) {
                this.contact = data().deepCopy(fields()[1].schema(), other.contact);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.account)) {
                this.account = data().deepCopy(fields()[2].schema(), other.account);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.address)) {
                this.address = data().deepCopy(fields()[3].schema(), other.address);
                fieldSetFlags()[3] = true;
            }
        }

        /**
         * Gets the value of the 'ID' field.
         * id of cus
         * @return The value.
         */
        public java.lang.Integer getID() {
            return ID;
        }

        /**
         * Sets the value of the 'ID' field.
         * id of cus
         * @param value The value of 'ID'.
         * @return This builder.
         */
        public com.vikram.Customer.Builder setID(int value) {
            validate(fields()[0], value);
            this.ID = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'ID' field has been set.
         * id of cus
         * @return True if the 'ID' field has been set, false otherwise.
         */
        public boolean hasID() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'ID' field.
         * id of cus
         * @return This builder.
         */
        public com.vikram.Customer.Builder clearID() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'contact' field.
         * contact of cus
         * @return The value.
         */
        public java.lang.CharSequence getContact() {
            return contact;
        }

        /**
         * Sets the value of the 'contact' field.
         * contact of cus
         * @param value The value of 'contact'.
         * @return This builder.
         */
        public com.vikram.Customer.Builder setContact(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.contact = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'contact' field has been set.
         * contact of cus
         * @return True if the 'contact' field has been set, false otherwise.
         */
        public boolean hasContact() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'contact' field.
         * contact of cus
         * @return This builder.
         */
        public com.vikram.Customer.Builder clearContact() {
            contact = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'account' field.
         * Account for cus
         * @return The value.
         */
        public java.lang.CharSequence getAccount() {
            return account;
        }

        /**
         * Sets the value of the 'account' field.
         * Account for cus
         * @param value The value of 'account'.
         * @return This builder.
         */
        public com.vikram.Customer.Builder setAccount(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.account = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'account' field has been set.
         * Account for cus
         * @return True if the 'account' field has been set, false otherwise.
         */
        public boolean hasAccount() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'account' field.
         * Account for cus
         * @return This builder.
         */
        public com.vikram.Customer.Builder clearAccount() {
            account = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'address' field.
         * address of cus
         * @return The value.
         */
        public java.lang.CharSequence getAddress() {
            return address;
        }

        /**
         * Sets the value of the 'address' field.
         * address of cus
         * @param value The value of 'address'.
         * @return This builder.
         */
        public com.vikram.Customer.Builder setAddress(java.lang.CharSequence value) {
            validate(fields()[3], value);
            this.address = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'address' field has been set.
         * address of cus
         * @return True if the 'address' field has been set, false otherwise.
         */
        public boolean hasAddress() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'address' field.
         * address of cus
         * @return This builder.
         */
        public com.vikram.Customer.Builder clearAddress() {
            address = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Customer build() {
            try {
                Customer record = new Customer();
                record.ID = fieldSetFlags()[0] ? this.ID : (java.lang.Integer) defaultValue(fields()[0]);
                record.contact = fieldSetFlags()[1] ? this.contact : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.account = fieldSetFlags()[2] ? this.account : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.address = fieldSetFlags()[3] ? this.address : (java.lang.CharSequence) defaultValue(fields()[3]);
                return record;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Customer>
            WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

    @Override public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Customer>
            READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

    @Override public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
