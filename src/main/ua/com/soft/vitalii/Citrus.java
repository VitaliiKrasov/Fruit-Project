package main.ua.com.soft.vitalii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class Citrus extends Fruit {
    private int containsViataminC;

    public Citrus(String name, Color color, int vitaminC) {
        super(name, color);
        this.containsViataminC = vitaminC;
    }

    public Citrus() {
    }

    @Override
    public void input(BufferedReader br) throws IOException {
        String[] input = br.readLine().trim().split("\\s+");
        setName(input[0]);
        setColor(Color.valueOf(input[1].toLowerCase()));
        setContainsViataminC(Integer.parseInt(input[2]));
    }

    public void setContainsViataminC(int containsViataminC) {
        this.containsViataminC = containsViataminC;
    }

    @Override
    public String toString() {
        return String.format("name = '%s', color = '%s', contains vitamin C = %d milligramms", getName(), getColor(), containsViataminC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citrus)) return false;
        if (!super.equals(o)) return false;
        Citrus citrus = (Citrus) o;
        return containsViataminC == citrus.containsViataminC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), containsViataminC);
    }

    public int getContainsViataminC() {
        return containsViataminC;
    }
}
