package design.pattern;

public abstract class Phone {

    public abstract int getRam();

    public abstract int getStorage();

    public abstract String getOS();


    @Override
    public String toString(){
        return "RAM= "+this.getRam()+", Storage="+this.getStorage()+", OS="+this.getOS();
    }
}
