package ch3;

import java.util.Scanner;

public class Task13PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.close();

        boolean isPrime = true;

        for(double i = 2; i*2 < number; i++){
            if(number % i == 0)
                isPrime = false;
            break;
        }

        /*        while (i*2 < number){
            if((number % i) == 0){
                System.out.println("This is not a prime number");
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
            i++;
        }*/

        if (isPrime){
            System.out.println("This is a prime number");
        }else
            System.out.println("This is not a prime number");
    }
}
