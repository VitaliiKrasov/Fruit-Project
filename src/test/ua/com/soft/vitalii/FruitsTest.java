package test.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Citrus;
import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;
import main.ua.com.soft.vitalii.Fruits;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FruitsTest {
    @DataProvider(name = "Fruits")
    public static Object[][] dataProvider() {
        return new Object[][] {{"Avocado", new Fruit("Avocado", Color.green)},
                {"Grapefruit", new Citrus("Grapefruit", Color.red, 31.2)},
                {"Lemon", new Citrus("Lemon", Color.red, 53)}};
    }

    @Test(dataProvider = "Fruits")
    public void testGetFruit(String name, Fruit expected) {
//        arrange

//        act
        Fruit actual = Fruits.valueOf(name).get();

//        assert
        Assert.assertEquals(actual, expected);
    }
}