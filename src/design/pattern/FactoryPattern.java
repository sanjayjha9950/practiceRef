package design.pattern;

public class FactoryPattern {



    public static void main(String args[]){
        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println("Getting Iphone \n \n");
        System.out.println(phoneFactory.getPhone(PhoneFactory.PhoneType.IPHONE,3,64));


        System.out.println("Getting Android \n \n");
        System.out.println(phoneFactory.getPhone(PhoneFactory.PhoneType.ANDROID,6,128));
    }
}
