package ch6;

import java.util.Scanner;

public class Task5FinabocciSequenceForLoop {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        double n1 = 0, n2 = 1, nextFinabocciNuber = 0;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i < count; i++) {
            nextFinabocciNuber = n1 + n2;
            System.out.printf("%.0f", nextFinabocciNuber);
            System.out.println();
            n1 = n2;
            n2 = nextFinabocciNuber;
        }
    }
}
