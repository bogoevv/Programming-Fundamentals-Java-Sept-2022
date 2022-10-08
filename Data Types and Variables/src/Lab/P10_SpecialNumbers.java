package Lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean specialNumberBool = false;

        for (int i = 1; i <= number; i++) {

            int currentNumber = i;
            int sum = 0;
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                sum += lastDigit;
                currentNumber = currentNumber / 10;

                specialNumberBool = sum == 5 || sum == 7 || sum == 11;
            }

            if (specialNumberBool){
                System.out.printf("%d -> True%n",i);
            }else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}

