package main.ua.com.soft.vitalii;

public enum Fruits {
    Apple (new Fruit("Apple", Color.red)),
    Avocado (new Fruit("Avocado", Color.green)),
    Grapefruit(new Citrus("Grapefruit", Color.red, 31.2)),
    Lemon(new Citrus("Lemon", Color.red, 53)),
    Clementine(new Citrus("Clementine", Color.orange, 48.8)),
    Tangerine(new Citrus("Tangerine", Color.red, 26.7)),
    Pomelo(new Citrus("Pomelo", Color.yellow, 61)),
    ;
    final Fruit fruit;

    Fruits(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit get() {
        return fruit;
    }
}
