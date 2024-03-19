package ru.geekbrains.oop.lesson4;


public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>(Repo.addOrange(2));

        Box<Orange> orangeBox2 = new Box<>(Repo.addOrange(4));

        Box<Apple> appleBox = new Box<>(Repo.addApple(2));
        Box<Apple> appleBox2 = new Box<>(Repo.addApple(4));


        System.out.println("Вес коробки с апельсинами" + "\t" + orangeBox.getWeight());
        System.out.println("Вес коробки с яблоками" + "\t" + appleBox.getWeight());

        boolean result = orangeBox.compare(appleBox);
        System.out.println(result);

        Transaction<Box<Apple>> transactionOrange = new Transaction<>(appleBox2, appleBox);
        transactionOrange.empty(2);

        Transaction<Box<Apple>> transaction = new Transaction<>();
        transaction.empty(appleBox2,appleBox);

    }



}
