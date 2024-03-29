package Test;

import src.Decorator.*;
import src.IceCream.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    IceCreamComponent basic = new VanillaIceCream();

    // Single Decorator Test
    @Test
    public void cocoSauceItemDeatilTest() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f", "Vanilla Ice Cream", 4.0,
                "+ Chocolate Sauce", 1.0);

        String actual = new ChocolateSauceDecorator(basic).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sbSauceItemDeatilTest() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f", "Vanilla Ice Cream", 4.0,
                "+ Strawberry Sauce", 1.5);

        String actual = new StrawberrySauceDecorator(basic).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void JellyItemDeatilTest() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f", "Vanilla Ice Cream", 4.0,
                "+ Jelly", 2.5);

        String actual = new JellyDecorator(basic).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MarshmallowItemDeatilTest() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f", "Vanilla Ice Cream", 4.0,
                "+ Marshmallow", 3.0);

        String actual = new MarshmallowDecorator(basic).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cocoSauceGetCostTest() {
        double expected = 5.0;
        double actual = new ChocolateSauceDecorator(basic).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void sbSauceGetCostTest() {
        double expected = 5.5;
        double actual = new StrawberrySauceDecorator(basic).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void jellyGetCostTest() {
        double expected = 6.5;
        double actual = new JellyDecorator(basic).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void marshmallowGetCostTest() {
        double expected = 7.0;
        double actual = new MarshmallowDecorator(basic).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    // Mutiple Decorator Test
    @Test
    public void multiDecoratorTest1_itemDetail() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f\n  %-18s %10.2f",
                "Vanilla Ice Cream", 4.0, "+ Jelly", 2.5, "+ Chocolate Sauce", 1.0);

        String actual = new ChocolateSauceDecorator(new JellyDecorator(basic)).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiDecoratorTest2_itemDetail() {
        String expected = String.format("%-20s %10.2f\n  %-18s %10.2f\n  %-18s %10.2f",
                "Vanilla Ice Cream", 4.0, "+ Marshmallow", 3.0, "+ Strawberry Sauce", 1.5);

        String actual = new StrawberrySauceDecorator(new MarshmallowDecorator(basic)).itemDetail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiDecoratorTest1_getCost() {
        double expected = 7.5;
        double actual = new ChocolateSauceDecorator(new JellyDecorator(basic)).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void multiDecoratorTest2_getCost() {
        double expected = 8.5;
        double actual = new StrawberrySauceDecorator(new MarshmallowDecorator(basic)).getCost();
        Assert.assertEquals(expected, actual, 0.1);
    }

}
