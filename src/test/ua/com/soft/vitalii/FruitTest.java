package test.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Citrus;
import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;
import main.ua.com.soft.vitalii.FruitException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class FruitTest {
    @DataProvider(name = "Fruits")
    public static Object[][] dataProvider() {
        return new Object[][] {{" Avocado  Green ", new Fruit("Avocado", Color.green)},
                {"Peach RED", new Fruit("Peach", Color.red)},};
    }
    @Test(dataProvider = "Fruits")
    public void testInput(String input, Fruit expected) throws IOException, FruitException {
//        arrange
        Fruit actual = new Fruit();
        BufferedReader br = new BufferedReader(new StringReader(input));
//        act
        actual.input(br);
//        assert
        assertEquals(actual, expected);
    }

    @Test (expectedExceptions = FruitException.class)
    public void testFruitExceptionInInput() throws IOException, FruitException {
//        arrange
        String test = " ";
        Fruit actual = new Fruit();
        BufferedReader br = new BufferedReader(new StringReader(test));
//        act
//        assert
        actual.input(br);
    }

    @Test (expectedExceptions = NullPointerException.class)
    public void testIOExceptionInInput() throws IOException, FruitException {
//        arrange
        String test = "";
        Fruit actual = new Fruit();
        BufferedReader br = new BufferedReader(new StringReader(test));
//        act
//        assert
        actual.input(br);
    }

    @Test
    public void testPrint() {
    }
}