package com.kushal.Assignment1;

public class Question2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + (int) average);
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
