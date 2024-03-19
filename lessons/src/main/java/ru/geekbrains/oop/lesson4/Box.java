package ru.geekbrains.oop.lesson4;

import java.util.ArrayList;


public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    private float weight;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }


    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        float sum = 0;
        for (Fruit f : fruits) {
            sum = sum + f.getWeight();
        }
        return sum;
    }

    public boolean compare(Box box) {
        if (box.getWeight() == this.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    
    @Override
    public String toString() {
                return String.format("Коробка: %s; Вес: %.2f кг.", fruits.size(), weight);
    }
}
