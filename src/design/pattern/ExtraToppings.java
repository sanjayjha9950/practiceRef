package design.pattern;

public class ExtraToppings extends PizzaDecorator{

    public ExtraToppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake(){
        super.bake();
        System.out.println("Adding Extra Toppings");
    }
}
