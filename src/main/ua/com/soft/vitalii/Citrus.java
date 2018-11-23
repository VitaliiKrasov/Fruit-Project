package main.ua.com.soft.vitalii;

import main.ua.com.soft.vitalii.Color;
import main.ua.com.soft.vitalii.Fruit;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public class Citrus extends Fruit {
    private int gramsVitaminС;

    public Citrus(String name, Color color, int vitaminC) {
        super(name, color);
        setGramsVitaminС(vitaminC);
    }

    public Citrus() {
    }

    @Override
    public void input(BufferedReader br) throws IOException {
        String[] input = br.readLine().trim().split("\\s+");
        setName(input[0]);
        setColor(Color.valueOf(input[1].toLowerCase()));
        setGramsVitaminС(Integer.parseInt(input[2]));
    }

    public void setGramsVitaminС(int gramsVitaminС) {
        this.gramsVitaminС = gramsVitaminС;
    }

    @Override
    public String toString() {
        return String.format("Citrus{name = '%s', color = '%s', contains vitamin C = %d gramms}", getName(), getColor(), gramsVitaminС);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citrus)) return false;
        if (!super.equals(o)) return false;
        Citrus citrus = (Citrus) o;
        return gramsVitaminС == citrus.gramsVitaminС;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gramsVitaminС);
    }
}
