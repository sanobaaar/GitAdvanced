package com.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sum = add(12, 3);
        System.out.println(sum);

      
        int num = 5;
        int x = 100;
        int b = 23;
        //method call
        increment(num);
        System.out.println("Outside function: " + num);
        System.out.println("Outside function: " + x);

        int[] myArray = { 1, 2, 3 };
        updateArray(myArray);
        System.out.println("First element: " + myArray[0]);

        String[] names = greetUsers();
        System.out.println("First name: " + names[0]);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void increment(int number) {
        number++;
        System.out.println("Inside function: " + number);
    }

    public static void updateArray(int[] numbers) {
        numbers[0] = 100;
    }

    public static String[] greetUsers() {
        return new String[] { "ABC", "XYZ" };
    }

}