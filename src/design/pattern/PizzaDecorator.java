package design.pattern;

public class PizzaDecorator implements Pizza {

    public Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake(){
        this.pizza.bake();
    }
}
