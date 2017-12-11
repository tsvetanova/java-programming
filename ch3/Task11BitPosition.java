package ch3;

import java.util.Scanner;

public class Task11BitPosition {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter position");
        int position = scanner.nextInt();
        scanner.close();

        int i = 1;
        int mask = i << position;
        System.out.println("Number " + number + " in decimal is " + Integer.toBinaryString(number));
        System.out.println("Bit in position " + position + " is " + ((number & mask) != 0 ? 1 : 0));
    }
}
