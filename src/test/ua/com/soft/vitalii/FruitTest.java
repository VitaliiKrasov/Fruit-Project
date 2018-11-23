package test.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;
import main.ua.com.soft.vitalii.FruitException;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class FruitTest {

    @Test
    public void testInput() throws IOException, FruitException {
//        arrange
        String test = " Avocado  Green ";
        Fruit expected = new Fruit("Avocado", Color.green);
        Fruit actual = new Fruit();
        BufferedReader br = new BufferedReader(new StringReader(test));
//        act
        actual.input(br);
//        assert
        assertEquals(actual, expected);
    }

    @Test (expectedExceptions = FruitException.class)
    public void testExceptionInInput() throws IOException, FruitException {
//        arrange
        String test = " ";
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