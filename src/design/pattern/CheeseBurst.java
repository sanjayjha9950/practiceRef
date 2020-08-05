package design.pattern;

public class CheeseBurst extends PizzaDecorator {

    public CheeseBurst(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Adding Cheese Burst Crust");
    }
}
