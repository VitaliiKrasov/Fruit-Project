package main.ua.com.soft.vitalii;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * 1) Утворити клас Фрукт, який містить:
 * + поля назва та колір,
 * + визначити конструктор з параметрами,
 * + методи input() та print(), для зчитування даних з консолі та виведення даних на консоль,
 * - а також перевантажити варіанти введення-виведення з файлу.
 * - ? властивості для полів,
 * + перевизначити метод toString().
 * <p>
 * 2) Утворити похідний від нього клас Цитрус, який має:
 * + поле - вміст вітаміну С в грамах,
 * + конструктор з параметрами,
 * - ? властивість,
 * + перевизначені методи input() та print().
 * <p>
 * 3) Утворити List фруктів і додати до нього 5 різних фруктів і цитрусів.
 * + Видрукувати дані про ті фрукти, колір яких є 'жовтий'.
 * + Посортувати список фруктів за назвою і
 * -     результат вивести у файл
 * - Передбачити перехоплення виняткових ситуацій
 * - Сериалізувати-десериалізувати список у Xml форматі
 * - Написати юніт-тести на методи класів
 */

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Charset charset = Charset.forName("UTF-8");

//        String readMe = "Enter fruit name, color";
//        System.out.println(readMe);
        List<Fruit> fruits = new LinkedList<Fruit>();
        try (BufferedWriter writerToFile = Files.newBufferedWriter(Paths.get("fruits.txt"), charset)) {
            for (int i = 0; i < 2; i++) {
                Fruit fruit = new Citrus();
                fruit.input(reader);
                fruits.add(fruit);
            }

            for (Fruit fruit : fruits) {
                fruit.print(writerToFile);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        } catch (FruitException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writerToConsole = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (Fruit fruit : fruits) {
                fruit.print(writerToConsole);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
//        fruits.add(new Fruit("Apple", Color.yellow));
//        fruits.add(new Citrus("Lemon", "yellow", 45));
//        fruits.add(new Citrus("Lime", "green", 35));
//        fruits.add(new Citrus("Grapefruit", "red", 50));
//        Fruit fruitApple = new Fruit();
//        fruitApple.input("apple.txt");
//        fruits.add(fruitApple);

//
//        System.out.println(Tools.getByColor(fruits, Color.red));
//        Tools.sortByName(fruits);
//
//        for (Fruit fruit : fruits) {
//            fruit.print("fruits.txt");
//            fruit.print();
//        }

    }
}
