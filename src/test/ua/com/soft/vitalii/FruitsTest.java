package test.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;
import main.ua.com.soft.vitalii.Fruits;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsTest {

    @Test
    public void testGetFruit() {
//        Arange


//        Act
        Fruit actual = Fruits.valueOf("Avocado").get();

        Fruit expected = new Fruit("Avocado", Color.green);
//        Assert
        Assert.assertEquals(actual, expected);
    }
}