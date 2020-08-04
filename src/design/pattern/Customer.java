package design.pattern;

public class Customer {


    private String name;
    private String customerId;
    private String phoneNumber;



    public Customer(CustomerBuilder customerBuilder){
        this.name = customerBuilder.name;
        this.customerId = customerBuilder.customerId;
        this.phoneNumber = customerBuilder.phoneNumber;
    }

    public static class CustomerBuilder{
        private String name;
        private String customerId;
        private String phoneNumber;

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerBuilder setPhoneNumber(String phoneNumber) {
            String phoneNumber2 = "+91-" + phoneNumber;
            this.phoneNumber = phoneNumber2;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerId='" + customerId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
