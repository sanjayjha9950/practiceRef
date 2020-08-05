package design.pattern;

public class BuilderPattern{

    public static void main(String args[]){
        Customer customer = new Customer.CustomerBuilder()
                .setName("Sanjay Jha")
                .setCustomerId("1001")
                .setPhoneNumber("9002744478")
                .build();

        System.out.println(customer.toString());

    }

}