package src.IceCream;

public class ChocolateIceCream implements IceCreamComponent {
    public ChocolateIceCream() {
    }

    public String itemDetail() {
        return String.format("%-20s %10.2f", "Chocolate Ice Cream", this.getCost());
    }

    public double getCost() {
        return 4.5;
    }

}
