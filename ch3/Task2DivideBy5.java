package ch3;

import java.util.Scanner;

public class Task2DivideBy5 {
    public static void main(String[] args) {
        System.out.println("Enter new Number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 5;

/*        if((input & 7) == 0 ) & (input & 7) == 0 )) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }*/

        System.out.println(a & b);
    }
}
