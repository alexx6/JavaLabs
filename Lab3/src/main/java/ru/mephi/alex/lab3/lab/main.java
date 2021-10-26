package ru.mephi.alex.lab3.lab;

import java.util.List;

public class main {
    public static void main (String... args) {
        List<Employee> sl = Employee.createShortList();
        System.out.println("\nAll employees:");
        sl.stream().forEach(p -> System.out.println(p));

        System.out.println("\nPaying premium to FEMALE:");
        sl.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .forEach(p -> Accountant.payPremium(p));
        System.out.println("\nPaying to employees of Finance dept:");
        sl.stream()
                .filter(p -> p.getDept() == "Finance")
                .forEach(p -> Accountant.paySalary(p));
        System.out.println("\nPaying premium to employees of Development dept older than 30 years:");
        sl.stream()
                .filter(p -> p.getAge() >= 30 && p.getDept() == "Development")
                .forEach(p -> Accountant.payPremium(p));
        System.out.println("\nPaying salary to managers:");
        sl.stream()
                .filter(p -> p.getRole().equals(Role.MANAGER))
                .forEach(p -> Accountant.paySalary(p));
        System.out.println("\nPaying salary to staff:");
        sl.stream()
                .filter(p -> p.getRole() == Role.STAFF)
                .forEach(p -> Accountant.payPremium(p));
    }
}
