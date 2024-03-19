package ru.geekbrains.oop.lesson4;

import java.util.ArrayList;

public class Repo {

    public static ArrayList<Orange> addOrange(int count) {
        ArrayList<Orange> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Orange());
        }
        return list;
    }

    public static ArrayList<Apple> addApple(int count) {
        ArrayList<Apple> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Apple());
        }
        return list;
    }
}
