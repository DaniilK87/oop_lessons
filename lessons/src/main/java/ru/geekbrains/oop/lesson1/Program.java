package ru.geekbrains.oop.lesson1;

import java.util.ArrayList;

/**
    Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
    Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
 **/

public class Program {

    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("Name #3", 250, 0.33);
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #1", "Name #2", 350, 0.5, 1);
        Chocolate chocolate = new Chocolate("Alpen Gold", "Шоколад молочный", 55.0,532.0, "60%");
        System.out.println(bottleOfWater1.displayInfo());
        System.out.println(bottleOfMilk1.displayInfo());

        Product product11 = new BottleOfWater("Name #3", 250, 0.5);
        Product product22 = new BottleOfMilk("Brand #1", "Name #2", 350, 0.5, 1);
        Product product33 = new Chocolate("Россия", "Шоколад горький", 300.0,569.0, "70%");


        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfWater1);
        list.add(bottleOfMilk1);
        list.add(chocolate);
        list.add(product11);
        list.add(product22);
        list.add(product33);

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name #3", 1.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Chocolate chocolateRes = vendingMachine.getChocolate("Шоколад горький", 569.0, "70%");
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }

    }

}
