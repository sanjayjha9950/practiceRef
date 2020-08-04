package design.pattern;

public class PhoneFactory {

    public Phone getPhone(PhoneType type,int ram,int storage){
        Phone phone = null;
        if (type.equals(PhoneType.IPHONE)){
            phone = new IPhone.IPhoneBuilder().setRam(ram).setStorage(storage).setOS("IOS").build();
        }else if (type.equals(PhoneType.ANDROID)){
            phone = new Android.AndroidBuilder().setRam(ram).setStorage(storage).setOS("Android").build();
        }
        return phone;
    }

    public enum PhoneType{
        IPHONE,ANDROID;
    }
}
