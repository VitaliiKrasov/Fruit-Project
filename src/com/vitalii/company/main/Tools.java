package com.vitalii.company.main;

import java.util.LinkedList;
import java.util.List;

public class Tools {
    public static List<Fruit> getByColor (List<Fruit> fruits, Color color) {
        List<Fruit> result = new LinkedList<Fruit>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor() == color) {
                result.add(fruit);
            } else continue;
        }
        return result;
    }
}
