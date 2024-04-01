package ru.geekbrains.oop.lesson7.entity;

import ru.geekbrains.oop.lesson7.Observer;
import ru.geekbrains.oop.lesson7.Publisher;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {


    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendVacancy(String vacancyType) {
        for (Observer observer : observers){
            observer.receiveVacancy(vacancyType);
        }
    }


}
