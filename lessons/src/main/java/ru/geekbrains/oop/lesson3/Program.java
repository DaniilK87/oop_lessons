package ru.geekbrains.oop.lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {


        Worker[] workers = EmployeeFabric.generateEmployees(5);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

//        Arrays.sort(workers, new SalaryComparator());

        System.out.println();
        System.out.println("Фрилансеры");
        System.out.println();

        Freelancer[] freelancers = EmployeeFabric.generateFreelancer(5);
        for (Freelancer f : freelancers) {
            System.out.println(f);
        }



        System.out.println();
        System.out.println("Фрилансеры + Рабочие");
        System.out.println();

        Employee[] employees = EmployeeFabric.generateEmployee(10);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Сортировка фрилансеров по ставке");
        System.out.println();

        List<Freelancer> freelancerSortedByRate = Arrays.stream(freelancers).sorted((o1, o2) -> {
            if (o1.getRate() < o2.getRate()) {
                return -1;
            } else {
                return 1;
            }
        }).collect(Collectors.toList());
        System.out.print(freelancerSortedByRate);

    }
}
