package ru.mephi.alex.lab3.homework2;

import ru.mephi.alex.lab3.lab.Employee;
import ru.mephi.alex.lab3.lab.Role;

import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static  void main (String... args) {
        List<Employee> sl = Employee.createShortList();
        //System.out.println("\nAll employees:");
        //sl.stream().forEach(p -> System.out.println(p));
        System.out.println("Salaries above 55300");
        int ls = sl.stream()
                .mapToInt(p -> p.getSalary())
                .filter(p -> p > 55300)
                .peek(p -> System.out.println(p))
                .min()
                .getAsInt();
        System.out.println("Lowest salary above 55300: " + ls);

        System.out.println("All premiums: ");
        double ls1 = sl.stream()
                .mapToDouble(p -> p.getSalary() * p.getRole().getPremium() / 100)
                .peek(p -> System.out.println(p))
                .average()
                .getAsDouble();
        System.out.println("Average premium: " + ls1);

        System.out.println("Sum of salaries: " + sl.stream()
                .mapToInt(p -> p.getSalary())
                .sum());

        System.out.println("Sum of premiums: " + sl.stream()
                .mapToInt(p -> p.getSalary() * p.getRole().getPremium() / 100)
                .sum());

        System.out.println("Salaries of staff: ");
        int ls2 = sl.stream()
                .filter(p -> p.getRole().equals(Role.STAFF))
                .mapToInt(p -> p.getSalary())
                .peek(p -> System.out.println(p))
                .max()
                .getAsInt();
        System.out.println("Max salary of staff: " + ls2);

        System.out.println("Average salary of managers: " + sl.stream()
                .filter(p -> p.getRole().equals(Role.STAFF))
                .mapToDouble(p -> p.getSalary())
                .average()
                .getAsDouble());

        System.out.println("All salaries higher than 10000? " + sl.stream()
                .allMatch(p -> p.getSalary() > 10000));
        System.out.println("Does anyone have a salary higher than 90000? " + sl.stream()
                .anyMatch(p -> p.getSalary() > 90000));

        System.out.println("Someone has a salary: " + sl.stream()
                .map(p -> p.getSalary())
                .findAny()
                .get());

        System.out.println("First employee in stream has that salary: " + sl.stream()
                .map(p -> p.getSalary())
                .findFirst()
                .get());


        sl.stream()
                .peek(p -> System.out.println(p.getGivenName() + " " + p.getSurName()))
                .filter(p -> p.getSalary() > 50000)
                .peek(p -> System.out.println(p.getSurName() + " " + p.getGivenName()))
                .collect(Collectors.toList());
    }
}
