package ru.geekbrains.oop.lesson2;


import java.util.ArrayList;
import java.util.List;

/**
 * Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 *         Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 *         Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 *         Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 *         Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = getCatList();
        Plate plate = new Plate(100);
        plate.info();
        for (Cat c: catList) {
            c.eat(plate);
        }

    }

    private static List<Cat> getCatList() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Barsik", 55, false));
        catList.add(new Cat("Thomas", 40, false));
        catList.add(new Cat("Boris", 40, false));
        catList.add(new Cat("Myrka", 40, false));
        return catList;
    }
}
