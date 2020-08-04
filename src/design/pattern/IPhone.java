package design.pattern;

public class IPhone extends Phone {

    private int ram;
    private int storage;
    private String OS ="IOS";

    @Override
    public int getRam() {
        return ram;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int getStorage() {
        return storage;
    }


    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String getOS() {
        return OS;
    }


    public void setOS(String OS) {
        this.OS = OS;
    }

    public IPhone(int ram, int storage){
        this.ram=ram;
        this.storage= storage;
        this.OS = "IOS";
    }

    public IPhone(IPhoneBuilder iPhoneBuilder){
        this.ram = iPhoneBuilder.ram;
        this.storage = iPhoneBuilder.storage;
        this.OS = iPhoneBuilder.OS;
    }

    public static class IPhoneBuilder{
        private int ram;
        private int storage;
        private String OS;

        public IPhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public IPhoneBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public IPhoneBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Phone build(){
            return new IPhone(this);
        }
    }
}
