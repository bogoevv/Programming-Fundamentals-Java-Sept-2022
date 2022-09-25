package Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int sumFactorial = 0;
        int number = numberInput;

        while (numberInput > 0){
            int  lastDigit = numberInput % 10;
            numberInput = numberInput / 10;
            int factorial = 1;

            for (int i = lastDigit; i > 0 ; i--) {
                factorial = factorial * i;
            }
            sumFactorial += factorial;
            factorial = 1;
        }
        if (number == sumFactorial){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
