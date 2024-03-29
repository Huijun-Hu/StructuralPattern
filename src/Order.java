package src;

import java.util.ArrayList;
import java.util.List;

import src.IceCream.IceCreamComponent;

public class Order {
    private List<IceCreamComponent> items;
    private LoyaltyStatus status;

    public Order(LoyaltyStatus status) {
        items = new ArrayList<>();
        this.status = status;
    }

    public List<IceCreamComponent> getItems() {
        return items;
    }

    public void add(IceCreamComponent item) {
        this.items.add(item);
    }

    public String totalCost() {
        String output = "";
        double sum = 0;
        for (IceCreamComponent i : items) {
            output += String.format("\n%s", i.itemDetail());
            sum += i.getCost();
        }
        output += String.format("\n%20s %10.2f", "Total Cost:", sum);

        if (this.status.getStatus()) {
            output += String.format("\n%30s", "Loyalty Discount(-15%) Applied");
            output += String.format("\n%20s %10.2f", "Final Cost:", sum * 0.85);
        }
        return output;
    }
}
