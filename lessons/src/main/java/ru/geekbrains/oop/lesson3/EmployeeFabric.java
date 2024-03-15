package ru.geekbrains.oop.lesson3;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Клим", "Лазарь", "Клим", "Рубен", "Василий" };
        String[] surnames = new String[] { "Григорьев", "Шестаков", "Шубин", "Бирюков", "Горбунов", "Соколов" };
        int salary = random.nextInt(Constants.MAX_SALARY - Constants.MIN_SALARY + 1) + Constants.MIN_SALARY;
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }


    public static Freelancer generateFreelancer() {
        String[] names = new String[] {"Глеб", "Мартин", "Владлен", "Панкратий", "Герман", "Мартин" };
        String[] surnames = new String[] { "Фокин", "Хохлов", "Шубин", "Копылов", "Лыткин"};
        double rate = Constants.MIN_RATE + Math.random() * Constants.INDEX_RATE;
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                rate);
    }

    public static Worker[] generateEmployees(int count){
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        return workers;
    }

    public static Freelancer[] generateFreelancer(int count){
        Freelancer[] freelancers = new Freelancer[count];
        for (int i = 0; i < count; i++){
            freelancers[i] = generateFreelancer();
        }
        return freelancers;
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployee(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                employees[i] = generateFreelancer();
            } else {
                employees[i] = generateWorker();
            }
        }
        return employees;
    }

}
