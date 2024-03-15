package ru.geekbrains.oop.lesson3;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 * среднемесячная заработная плата = 20.8 * 8 * почасовая ставка
 */
public class Freelancer extends Employee {

    private double rate;

    private Freelancer(String surName, String name, double rate) {
        super(surName, name);
        this.rate = rate;
    }

    public static Freelancer create(String surName, String name, double rate) {
        return new Freelancer(surName, name, rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        salary = 2000.8 * 8 * rate;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f; заработная плата: %.2f руб.",
                surName, name, rate, calculateSalary());
    }
}
