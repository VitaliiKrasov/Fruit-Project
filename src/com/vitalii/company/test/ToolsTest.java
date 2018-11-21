package com.vitalii.company.test;

import com.vitalii.company.main.Citrus;
import com.vitalii.company.main.Color;
import com.vitalii.company.main.Fruit;
import com.vitalii.company.main.Tools;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static com.vitalii.company.main.Tools.getByColor;
import static org.testng.Assert.*;

public class ToolsTest {

    @Test
    public void testGetByColor() {
//        Arange
        List<Fruit> fruits = new LinkedList<Fruit>();
        fruits.add(new Fruit("Apple", "yellow"));
        fruits.add(new Fruit("Apple", "red"));
        fruits.add(new Citrus("Lemon", "yellow", 20));
        fruits.add(new Citrus("Lime", "green", 15));

        List<Fruit> expected = new LinkedList<Fruit>();
        expected.add(new Fruit("Apple", "yellow"));
        expected.add(new Citrus("Lemon", "yellow", 20));
//        Act

//        Assert
        assertEquals(getByColor(fruits, Color.YELLOW), expected);
    }
}