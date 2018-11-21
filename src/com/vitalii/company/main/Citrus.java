package com.vitalii.company.main;

public class Citrus extends Fruit{
    /**вміст вітаміну С в грамах**/
    private int gramsVitaminС;

    public Citrus(String name, String color, int vitaminC) {
        super(name, color);
        this.gramsVitaminС = vitaminC;
    }

    public int getGramsVitaminС() {
        return gramsVitaminС;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name=" + getName() +
                ", color=" + getColor() +
                ", gramsVitaminС=" + gramsVitaminС +
                '}';
    }
}
