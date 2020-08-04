package design.pattern;

public class Android extends Phone {

    private int ram;
    private int storage;
    private String OS = "Android OS";

    @Override
    public int getRam() {
        return ram;
    }


    @Override
    public int getStorage() {
        return storage;
    }



    @Override
    public String getOS() {
        return OS;
    }



    public Android(int ram, int storage){
        this.ram=ram;
        this.storage= storage;
        this.OS = "Android-OS";
    }

    public Android(AndroidBuilder androidBuilder){
        this.ram = androidBuilder.ram;
        this.storage = androidBuilder.storage;
        this.OS = androidBuilder.OS;
    }

    public static class AndroidBuilder{
        private int ram;
        private int storage;
        private String OS;

        public AndroidBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public AndroidBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public AndroidBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }


        public Phone build(){
            return new Android(this);
        }
    }
}
