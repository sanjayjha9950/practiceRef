package design.pattern;

public class DecoratorPattern {

    public static void main(String args[]){

        System.out.println("Simple Pizza\n");
        Pizza simple = new FreshPizza();
        simple.bake();
        System.out.println("============================================ \n");

        System.out.println("Cheese burst Pizza\n");
        Pizza cheeseBurst = new CheeseBurst(simple);
        cheeseBurst.bake();
        System.out.println("============================================ \n");

        System.out.println("Loaded Pizza\n");
        Pizza loaded = new ExtraToppings(cheeseBurst);
        loaded.bake();
        System.out.println("============================================");
    }
}
