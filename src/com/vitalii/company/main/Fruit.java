package com.vitalii.company.main;

public abstract class Fruit {
    private String name;
    private Color color;

    public Fruit(String name, String color) {
        setName(name);
        setColor(color);
    }

    public void input() {}
    public void print() {}


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
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
