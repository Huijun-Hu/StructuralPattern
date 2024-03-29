package src.Decorator;

import src.IceCream.IceCreamComponent;

public class MarshmallowDecorator implements IceCreamComponent {
    private IceCreamComponent decorated;
    private double cost = 3;

    public MarshmallowDecorator(IceCreamComponent plainIceCream) {
        this.decorated = plainIceCream;
    }

    public String itemDetail() {
        return decorated.itemDetail() + String.format("\n  %-18s %10.2f", "+ Marshmallow", this.cost);
    }

    public double getCost() {
        return decorated.getCost() + this.cost;
    }
}
