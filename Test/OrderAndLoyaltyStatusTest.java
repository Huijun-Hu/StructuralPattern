package Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import src.IceCream.*;
import src.*;

public class OrderAndLoyaltyStatusTest {
    @Test
    public void addTest() {
        IceCreamComponent i1 = new PineappleIceCream();
        IceCreamComponent i2 = new VanillaIceCream();

        List<IceCreamComponent> expected = new ArrayList<>();
        expected.add(i1);
        expected.add(i2);

        Order o = new Order(new LoyaltyStatus("XYZ", false));
        o.add(i1);
        o.add(i2);
        List<IceCreamComponent> actual = o.getItems();

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    // Test without Lotalty discout
    @Test
    public void totalCostTest() {
        String expected = String.format("\n%-20s %10.2f\n%-20s %10.2f\n%20s %10.2f",
                "Pineapple Ice Cream", 5.5,
                "Vanilla Ice Cream", 4.0,
                "Total Cost:", 9.5);
        Order o = new Order(new LoyaltyStatus("XYZ", false));
        o.add(new PineappleIceCream());
        o.add(new VanillaIceCream());
        String actual = o.totalCost();

        Assert.assertEquals(expected, actual);
    }

    // Test with Lotalty discout
    @Test
    public void totalCostTest_withDiscout() {
        String expected = String.format("\n%-20s %10.2f\n%-20s %10.2f\n%20s %10.2f\n%30s\n%20s %10.2f",
                "Pineapple Ice Cream", 5.5,
                "Vanilla Ice Cream", 4.0,
                "Total Cost:", 9.5,
                "Loyalty Discount(-15%) Applied",
                "Final Cost:", 8.08);

        Order o = new Order(new LoyaltyStatus("XYZ", true));
        o.add(new PineappleIceCream());
        o.add(new VanillaIceCream());
        String actual = o.totalCost();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLoyaltyStatusTest() {
        boolean expected = true;
        boolean actual = new LoyaltyStatus("XYZ", true).getStatus();
        Assert.assertEquals(expected, actual);
    }
}
