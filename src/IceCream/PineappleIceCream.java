package src.IceCream;

public class PineappleIceCream implements IceCreamComponent {
    public PineappleIceCream() {
    }

    public String itemDetail() {
        return String.format("%-20s %10.2f", "Pineapple Ice Cream", this.getCost());
    }

    public double getCost() {
        return 5.5;
    }
}
