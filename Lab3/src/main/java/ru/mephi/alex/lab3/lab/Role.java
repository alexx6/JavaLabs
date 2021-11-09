package ru.mephi.alex.lab3.lab;

public enum Role {
    STAFF(10),
    MANAGER(20),
    EXECUTIVE(30);
    private final int premium;
    Role(int p) {
        premium = p;
    }
    public int getPremium() {
        return  premium;
    }

}
