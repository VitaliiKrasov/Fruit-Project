package com.vitalii.company.main;

import java.io.IOException;
import java.util.Objects;

import static com.vitalii.company.main.Reader.reader;

public class Fruit {
    private String name;
    private Color color;

    public Fruit(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Fruit() {
    }

    public boolean equals(Fruit f) {
        boolean nameEquels = (this.getName() == f.getName());
        boolean colorEquels = (this.getColor() == f.getColor());
        if (nameEquels && colorEquels) {
            return true;
        } else return false;
    }

    public void input() throws IOException {
        System.out.println("Enter fruit name:");
        this.setName(reader.readLine());
        System.out.println("Enter fruit color:");
        this.setColor(reader.readLine());
    }

    public void print() {
        System.out.println(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color.toUpperCase());
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) &&
                color == fruit.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
