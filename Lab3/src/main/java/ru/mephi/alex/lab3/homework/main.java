package ru.mephi.alex.lab3.homework;

import ru.mephi.alex.lab3.lab.Employee;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class main {
    public static void main (String... args) {
        Function<Employee, String> employeeName =
                p -> p.getGivenName() + " " + p.getSurName();
        List<Employee> sl = Employee.createShortList();
        Employee emp = sl.get(0);
        System.out.println(employeeName.apply(emp));

        Consumer<Employee> employeeInfo =
                p -> System.out.println(emp.toString());
        employeeInfo.accept(emp);

        Supplier<Employee> employeeGet =
                () -> {return Employee.createShortList().get(ThreadLocalRandom.current().nextInt(0, 8));};
        System.out.println(employeeGet.get());

        BiPredicate<Employee, Employee> employeeSameDept =
                (p, k) -> {return p.getDept() == k.getDept();};
        System.out.println("Two random employees are from same dept? " + ((employeeSameDept.test(employeeGet.get(),employeeGet.get())) ? "Yes" : "No"));
    }

}
