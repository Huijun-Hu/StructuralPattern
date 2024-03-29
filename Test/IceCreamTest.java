// I will test the different favor of ice-cream here
package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import src.IceCream.*;

public class IceCreamTest {

    IceCreamComponent chocoFavor = new ChocolateIceCream();
    IceCreamComponent strawberryFavor = new StrawberryIceCream();
    IceCreamComponent pineappleFavor = new PineappleIceCream();
    IceCreamComponent vanillaFavor = new VanillaIceCream();

    @Test
    public void itemDetailTest_choco() {
        String expected = String.format("%-20s %10.2f", "Chocolate Ice Cream", 4.5);
        String actual = chocoFavor.itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void itemDetailTest_strawberry() {
        String expected = String.format("%-20s %10.2f", "Strawberry Ice Cream", 5.0);
        String actual = strawberryFavor.itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void itemDetailTest_pineapple() {
        String expected = String.format("%-20s %10.2f", "Pineapple Ice Cream", 5.5);
        String actual = pineappleFavor.itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void itemDetailTest_vanilla() {
        String expected = String.format("%-20s %10.2f", "Vanilla Ice Cream", 4.0);
        String actual = vanillaFavor.itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCostTest_choco() {
        double expected = 4.5;
        double actual = chocoFavor.getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void getCostTest_strawberry() {
        double expected = 5.0;
        double actual = strawberryFavor.getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void getCostTest_pineapple() {
        double expected = 5.5;
        double actual = pineappleFavor.getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void getCostTest_vanilla() {
        double expected = 4.0;
        double actual = vanillaFavor.getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }
}