package test.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Citrus;
import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;
import main.ua.com.soft.vitalii.XMLtools;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

public class XMLtoolsTest {
    File file_fruits = new File("file_fruits.xml");

    @AfterClass
    public void clean() {
        file_fruits.delete();
    }

    @Test
    public void testSaveAndRead() {
//        arrange
        List<Fruit> expected = new LinkedList<Fruit>();
        expected.add(new Fruit("Apple", Color.yellow));
        expected.add(new Citrus("Lemon", Color.yellow, 45));
        expected.add(new Citrus("Lime", Color.green, 35));
        expected.add(new Citrus("Grapefruit", Color.red, 50));
//        act
        try {
            XMLtools.save(expected);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Fruit> actual = new ArrayList<>();
        try {
            actual.addAll(XMLtools.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        assert
        assertEquals(actual, expected);
    }
}