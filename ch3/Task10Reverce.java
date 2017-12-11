package ch3;

import java.util.Scanner;

public class Task10Reverce {
    public static void main(String[] args) {
        System.out.println("Enter four digit number");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int reversedNumber = 0;

        while (input > 0) {
            int digit = input % 10;
            sum = sum + digit;
            reversedNumber = reversedNumber*10 + digit;
            input = input/10;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Reverced is: " + reversedNumber);
    }
}
