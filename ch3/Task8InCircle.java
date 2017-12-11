package ch3;

import java.util.Scanner;

public class Task8InCircle {
    public static void main(String[] arg) {
        System.out.println("Enter one position x ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter one position y ");
        int y = scanner.nextInt();
        scanner.close();

        if ((Math.pow(x, 2) + Math.pow(y, 2)) < Math.pow(5, 2)) {
            System.out.println("Point is inside the circle");
        }else {
            System.out.println("Point is outside of the circle");
        }

    }
}