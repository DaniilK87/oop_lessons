package ru.geekbrains.oop.lesson1;

/**
 Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
 Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
 **/

public class Chocolate extends Product {

    private double calories;
    private String cocoaPercent;

    public Chocolate(String brand, String name, double price, double calories, String cocoaPercent) {
        super(brand,name,price);
        this.calories = calories;
        this.cocoaPercent = cocoaPercent;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getCocoaPercent() {
        return cocoaPercent;
    }

    public void setCocoaPercent(String cocoaPercent) {
        this.cocoaPercent = cocoaPercent;
    }


    @Override
    public String displayInfo() {
        return "Шоколад ->" + '\t' +
                "[ калорий=" + calories +
                ", процент какао='" + cocoaPercent + '\'' +
                ", название='" + name + '\'' +
                ", изготовитель='" + brand + '\'' +
                ", цена=" + price +
                " ]";
    }
}
