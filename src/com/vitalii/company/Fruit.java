package com.vitalii.company;

public abstract class Fruit {
    private String name;
    private Color color;

    public Fruit(String name, Color color) {
        this.name = name;
        this.color = color;
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

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
