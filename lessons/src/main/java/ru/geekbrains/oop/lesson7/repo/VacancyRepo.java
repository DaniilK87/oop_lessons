package ru.geekbrains.oop.lesson7.repo;

import ru.geekbrains.oop.lesson7.entity.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class VacancyRepo {

    private static String [] array = {"Java junior developer", "Java middle developer", "Senior java developer", "HR", "Sales manager"};
    public static List<Vacancy> vacancyList() {
        Vacancy vacancy = null;
        List<Vacancy> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            vacancy = new Vacancy();
            vacancy.setVacancyType(array[i]);
            list.add(vacancy);
        }
        return list;
    }
}
