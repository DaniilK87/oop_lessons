package ru.geekbrains.oop.lesson7;

public interface Observer {

    void receiveOffer(String nameCompany, int salary);

    void receiveVacancy(String vacancyType);


}
