package ru.mephi.alex.lab3.lab;

public class Accountant {
    public static void paySalary(Employee employee) {
        System.out.println("Paid to: " + employee.toString());
    }
    public static void payPremium(Employee employee) {
        System.out.println("Paid " + employee.getRole().getPremium() + "% premium to: " + employee.toString());
    }
}
