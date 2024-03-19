package ru.geekbrains.oop.lesson4;

public class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Апельсин{" +
                "вес =" + weight +
                '}';
    }
}
