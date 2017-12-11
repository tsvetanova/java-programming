package ch3;

import java.util.Scanner;

public class Task1CheckEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter new Number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if((input % 2) == 0 ) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }

    }
}
