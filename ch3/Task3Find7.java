package ch3;

import java.util.Scanner;

public class Task3Find7 {
    public static void main(String[] args) {
        System.out.println("Enter new Number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int b = 5;

        input = input / 100;

        if((input % 10) == b) {
            System.out.println("Third number is 7");
        }else {
            System.out.println("Third number is not 7");
        }
    }
}

