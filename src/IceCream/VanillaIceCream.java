package src.IceCream;

public class VanillaIceCream implements IceCreamComponent {
    public VanillaIceCream() {
    }

    public String itemDetail() {
        return String.format("%-20s %10.2f", "Vanilla Ice Cream", this.getCost());
    }

    public double getCost() {
        return 4.0;
    }
}