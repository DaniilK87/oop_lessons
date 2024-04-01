package ru.geekbrains.oop.lesson7.entity;

import ru.geekbrains.oop.lesson7.Observer;

public class Junior implements Observer {

    private String name;
    private int salary;

    private String speciality;

    public Junior(String name){
        this.name = name;
        salary = 55_000;
        this.speciality = "Java junior developer";
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Начинающий специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
        else {
            System.out.printf("Начинающий специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(String vacancyType) {
        if (this.speciality.equals(vacancyType)){
            System.out.printf("Начинающий специалист %s: Вакансия %s мне подходит)\n",name, speciality);
        }
        else {
            System.out.printf("Начинающий специалист %s: Вакансия %s мне не подходит\n",name, vacancyType);
        }
    }

}
