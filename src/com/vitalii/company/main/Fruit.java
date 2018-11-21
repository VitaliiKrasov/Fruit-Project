package com.vitalii.company.main;

import java.io.IOException;

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
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
