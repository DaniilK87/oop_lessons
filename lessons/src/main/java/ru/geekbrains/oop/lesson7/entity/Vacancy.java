package ru.geekbrains.oop.lesson7.entity;

public class Vacancy {

    private String vacancyType;


    public String getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(String vacancyType) {
        this.vacancyType = vacancyType;
    }

    @Override
    public String toString() {
        return "Вакансия =" + vacancyType + '\'';
    }
}
