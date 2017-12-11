package ch6;

import java.util.Scanner;

public class Task5FinabocciSequenceRecursion {

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int index = 0;
        while (index <= count) {
            System.out.println(finabocci(index));
            index++;
        }

    }

    static long finabocci(int index) {
        if (index == 0) return 0;
        if (index <= 2) return 1;
        long fibTerm = finabocci(index - 1) + finabocci(index - 2);
        return fibTerm;
    }
}
