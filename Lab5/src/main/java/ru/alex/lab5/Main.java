package ru.alex.lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String... args) {

        int[] a = {1, 3, 5};
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        FileInputStream file;
        try {
            file = new FileInputStream("hello.h");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Integer f = null;
        try {
            System.out.println(f);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            new FileInputStream("ru/alex/lab5/asdf");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String[] t = {"aa", "bb", "cc" };
        try {
            ArrayList<String> strList = (ArrayList<String>) Arrays.asList(t);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer k = 1;
            k /= 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Integer> ppp = new ArrayList<>();
        try {
            while (true) ppp.add(9999999);
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }

        try {
            ppp(1);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }



    }

    static int ppp(int i) {
        return ppp(i+1);
    }
}
