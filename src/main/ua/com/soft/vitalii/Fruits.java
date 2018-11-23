package main.ua.com.soft.vitalii;

public enum Fruits {
    Grapefruit(new Citrus("Grapefruit", Color.red, 50)),
    Apple (new Fruit("Apple", Color.red)),
    Avocado (new Fruit("Avocado", Color.green));

    final Fruit fruit;

    Fruits(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit get() {
        return fruit;
    }
}
