package com.felipecunha;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //JAVA BASICS

        //simple variables
        byte age = 30;
        long timeStudying = 3_000_000_000L;
        float myKnowledge = 80.75F;
        String myName = "Felipe Cunha";
        boolean isDone = false;
        System.out.println(
                "Hello, my name is " + myName +
                ". My time styding is: " + timeStudying +
                ", and my knowledge is at: " + myKnowledge +
                "%, which means that I'm done studying: " + isDone);

        //references
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        //snippet "sout" to print
        System.out.println("\n" + point2);

        //modify strings
        myName.toLowerCase();
        myName.toUpperCase();
        myName.trim();
        myName.replace("Cunha", "\"Ruben\"");

        //arrays
        int[] numbers = {2, 5 ,4 ,3 ,6, 1};
        System.out.println("Array length: " + numbers.length);
        System.out.println("Array numbers: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString((numbers)));
        //2d array
        int [][] numbers2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("2D Arrays: " + Arrays.deepToString(numbers2D));

        //constant
        final float PI = 3.14F;

        //arithmetic expressions
        double result = (double)10 / (double) 3;
        System.out.println(result);
        result++;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        //priority list: () /* +-

        //String to integer
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);

        //Math class
        int math0 = (int) Math.round(Math.random() * 100);
        int math1 = Math.min(1, 2);
        int math2 = Math.max(1 ,2);
        int math3 = Math.round(1.1F);

        //Formating numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedNumbers = currency.format(123452313.123);
        System.out.println(formattedNumbers);
        //chained method
        String formattedPercentage = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(formattedPercentage);

        //Input
        Scanner scanner = new Scanner(System.in);
        //age
        System.out.print("Age: ");
        byte yourAge = scanner.nextByte();
        System.out.println("You are " + yourAge);
        //name
        System.out.print("Name: ");
        String yourName = scanner.nextLine().trim();
        System.out.println("You are " + yourName);

        //comparison
        int a = 1;
        int b = 2;
        System.out.println(a == b);
        System.out.println(a != b);

        //logical operators &&(and) ||(or) !(not)
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("Temperature is warm: " + isWarm);

        //if
        if (temperature > 20) {
            System.out.println("It is nice and cozy");
        } else if (temperature > 30) {
            System.out.println("It's really hot");
        } else {
            System.out.println("It's cold");
        }
        //simple if
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000) {
            hasHighIncome = true;
        }

        //ternary operator can replate if
        String className = income > 100_000 ? "First" : "Economy";


        //switch
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "guest":
                System.out.println("You are a guest");
        }

        //for
        for (int i = 0; i < 5; i++) {
            System.out.println("Print " + i);
        }

        //while
        int i = 5;
        while (i > 0) {
            System.out.println("Print while " + i);
            i--;
        }
        //while quit
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase().trim();
        }

        //do while
        do {
            i++;
            System.out.println(i);
        } while (i > 10);

        //for each (always forward)
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
