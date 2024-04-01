package ru.geekbrains.oop.lesson7.entity;


import ru.geekbrains.oop.lesson7.CompanyImpl;
import ru.geekbrains.oop.lesson7.Publisher;

import java.util.List;
import java.util.Random;

public class Company implements CompanyImpl {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;
    private List<Vacancy> list;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public Company(String name, Publisher jobAgency, List<Vacancy> list) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.list = list;
    }

    @Override
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    @Override
    public void sendVacancy() {
        for (Vacancy v: list) {
            jobAgency.sendVacancy(v.getVacancyType());
        }
    }
}
