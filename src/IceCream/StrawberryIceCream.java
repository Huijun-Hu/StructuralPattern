package src.IceCream;

public class StrawberryIceCream implements IceCreamComponent {

    public StrawberryIceCream() {
    }

    public String itemDetail() {
        return String.format("%-20s %10.2f", "Strawberry Ice Cream", this.getCost());
    }

    public double getCost() {
        return 5.0;
    }
}
