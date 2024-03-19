package ru.geekbrains.oop.lesson4;

public class Apple extends Fruit{

    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Яблоко{" +
                "вес =" + weight +
                '}';
    }
}
