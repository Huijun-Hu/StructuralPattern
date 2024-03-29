package src.Decorator;

import src.IceCream.IceCreamComponent;

public class JellyDecorator implements IceCreamComponent {
    private IceCreamComponent decorated;
    private double cost = 2.5;

    public JellyDecorator(IceCreamComponent plainIceCream) {
        this.decorated = plainIceCream;
    }

    public String itemDetail() {
        return decorated.itemDetail() + String.format("\n  %-18s %10.2f", "+ Jelly", this.cost);
    }

    public double getCost() {
        return decorated.getCost() + this.cost;
    }
}
