package ru.mephi.alex.lab3.lab;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private int code;

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public String getEMail() {
        return eMail;
    }
    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getCode() {
        return code;
    }

    public static class Builder {
        private Employee employee;

        public Builder() {
            employee = new Employee();
        }

        public Builder givenName(String s) {
            employee.givenName = s;
            return this;
        }

        public Builder surName(String s) {
            employee.surName = s;
            return this;
        }

        public Builder age(int a) {
            employee.age = a;
            return this;
        }

        public Builder gender(Gender g) {
            employee.gender = g;
            return this;
        }

        public Builder role(Role r) {
            employee.role = r;
            return this;
        }

        public Builder dept(String s) {
            employee.dept = s;
            return this;
        }

        public Builder eMail(String s) {
            employee.eMail = s;
            return this;
        }

        public Builder phone(String s) {
            employee.phone = s;
            return this;
        }

        public Builder address(String s) {
            employee.address = s;
            return this;
        }

        public Builder city(String s) {
            employee.city = s;
            return this;
        }

        public Builder state(String s) {
            employee.state = s;
            return this;
        }

        public Builder code(int c) {
            employee.code = c;
            return this;
        }

        public Employee build() {
            return employee;
        }
    }

    @Override
    public String toString() {
        return ((givenName != null) ? "givenName=" + givenName + " " : "") +
                ((surName != null) ? "surName=" + surName + " " : "") +
                ((age != 0) ? "age=" + age + " " : "") +
                ((gender != null) ? "gender=" + gender + " " : "") +
                ((role != null) ? "role=" + role + " " : "") +
                ((dept != null) ? "dept=" + dept + " " : "") +
                ((eMail != null) ? "eMail=" + eMail + " " : "") +
                ((phone != null) ? "phone=" + phone + " " : "") +
                ((address != null) ? "address=" + address + " " : "") +
                ((city != null) ? "city=" + city + " " : "") +
                ((state != null) ? "state=" + state + " " : "") +
                ((code != 0) ? "code=" + code + " " : "");
    }

    public static List<Employee> createShortList() {
        List<Employee> shortList = new ArrayList<>();
        shortList.add(new Employee.Builder()
                .givenName("Alex")
                .surName("Dmitriev")
                .age(23)
                .gender(Gender.MALE)
                .role(Role.STAFF)
                .dept("Research")
                .eMail("alex@dmitriev.ru")
                .phone("+07583859305")
                .address("Centralnaya st. 94")
                .city("Yekaterinburg")
                .state("Sverdlovskaya region")
                .code(369239)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Dmitry")
                .surName("Petrov")
                .age(26)
                .gender(Gender.MALE)
                .role(Role.MANAGER)
                .dept("Development")
                .eMail("dmitry@petrov.ru")
                .phone("+03748593029")
                .address("Pushkina st. 52")
                .city("Dmitrov")
                .state("Moscow region")
                .code(383750)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Petr")
                .surName("Alexeev")
                .age(31)
                .gender(Gender.MALE)
                .role(Role.EXECUTIVE)
                .dept("Development")
                .eMail("petr@alexeev.ru")
                .phone("+04758322958")
                .address("Leninskiy avenue 123")
                .city("Moscow")
                .state("Moscow city")
                .code(345739)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Anna")
                .surName("Sidorova")
                .age(24)
                .gender(Gender.FEMALE)
                .role(Role.MANAGER)
                .dept("Finance")
                .eMail("anna@sidorova.ru")
                .phone("+05819604837")
                .address("Tarasa Shevchenko st. 72")
                .city("Kiev")
                .state("Kiev region")
                .code(967827)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Polina")
                .surName("Novikova")
                .age(27)
                .gender(Gender.FEMALE)
                .role(Role.STAFF)
                .dept("Finance")
                .eMail("polina@novikova.ru")
                .phone("+04738195837")
                .address("Lenina st. 59")
                .city("Minsk")
                .state("Minsk region")
                .code(385739)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Nikolay")
                .surName("Ivanov")
                .age(20)
                .gender(Gender.MALE)
                .role(Role.STAFF)
                .dept("Finance")
                .eMail("nikolay@ivanov.ru")
                .phone("+05637583716")
                .address("Tverskaya st. 94")
                .city("Moscow")
                .state("Moscow city")
                .code(395867)
                .build());
        shortList.add(new Employee.Builder()
                .givenName("Ivan")
                .surName("Nikolaev")
                .age(24)
                .gender(Gender.MALE)
                .role(Role.STAFF)
                .dept("Research")
                .eMail("ivan@nikolaev.ru")
                .phone("+06916357029")
                .address("Tverskaya st. 94")
                .city("St. Petersburg")
                .state("St. Petersburg city")
                .code(682746)
                .build());

        return shortList;
    }


}