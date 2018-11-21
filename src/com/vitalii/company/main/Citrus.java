package com.vitalii.company.main;

import java.io.IOException;

import static com.vitalii.company.main.Reader.reader;

public class Citrus extends Fruit{
    /**вміст вітаміну С в грамах**/
    private int gramsVitaminС;

    public Citrus(String name, String color, int vitaminC) {
        super(name, color);
        this.gramsVitaminС = vitaminC;
    }

    public Citrus() {

    }

    public int getGramsVitaminС() {
        return gramsVitaminС;
    }


    @Override
    public void input() throws IOException {
        super.input();
        System.out.println("Enter Grams of VitaminС:");
        this.setGramsVitaminС(Integer.parseInt(reader.readLine()));
    }

    @Override
    public String toString() {
        return "Citrus{" +
                "name=" + getName() +
                ", color=" + getColor() +
                ", gramsVitaminС=" + gramsVitaminС +
                '}';
    }

    public void setGramsVitaminС(int gramsVitaminС) {
        this.gramsVitaminС = gramsVitaminС;
    }
}
