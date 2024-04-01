package ru.geekbrains.oop.lesson7;

import ru.geekbrains.oop.lesson7.entity.*;
import ru.geekbrains.oop.lesson7.repo.VacancyRepo;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Company microsoft = new Company("Microsoft", publisher, VacancyRepo.vacancyList());

        Junior junior = new Junior("#1");
        Middle middle = new Middle("#1");
        Senior senior = new Senior("#1");

        publisher.registerObserver(junior);
        publisher.registerObserver(middle);
        publisher.registerObserver(senior);


        for (int i = 0; i < 1; i++) {
            microsoft.sendVacancy();
        }

        for (int i = 0; i < 1; i++){
            google.needEmployee();
        }

    }

}
