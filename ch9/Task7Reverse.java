package ch9;

import java.util.Scanner;

public class Task7Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(reverce(number));
    }

    private static int reverce(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            number = number/10;

        }
        return reversedNumber;
    }
}
