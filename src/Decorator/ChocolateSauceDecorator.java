package src.Decorator;

import src.IceCream.IceCreamComponent;

public class ChocolateSauceDecorator implements IceCreamComponent {

    private IceCreamComponent decorated;
    private double cost = 1;

    public ChocolateSauceDecorator(IceCreamComponent plainIceCream) {
        this.decorated = plainIceCream;
    }

    public String itemDetail() {
        return decorated.itemDetail() + String.format("\n  %-18s %10.2f", "+ Chocolate Sauce", this.cost);
    }

    public double getCost() {
        return decorated.getCost() + this.cost;
    }
}
