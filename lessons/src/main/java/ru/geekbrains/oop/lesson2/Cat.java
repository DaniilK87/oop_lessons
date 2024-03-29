package ru.geekbrains.oop.lesson2;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        while (!isSatiety()) {
            if (plate.getFood() < this.getAppetite()) {
                System.out.println("В тарелке мало еды");
                System.out.println(this.getName() + '\t' + "остался голодным");
                break;
            } else {
                plate.setFood(plate.getFood() - this.getAppetite());
                System.out.println(this.getName() + '\t' + "сытый");
                System.out.println("В тарелке осталось еды" + '\t' + plate.getFood());
                setSatiety(true);
            }
        }
    }
}
