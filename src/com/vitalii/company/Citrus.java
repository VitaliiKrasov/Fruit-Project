package com.vitalii.company;

public abstract class Citrus extends Fruit{
    /**вміст вітаміну С в грамах**/
    private int vitaminC;

    public Citrus(String name, Color color, int vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }
}
