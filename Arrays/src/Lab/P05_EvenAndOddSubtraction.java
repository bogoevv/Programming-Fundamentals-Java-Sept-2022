package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int element : numbersArr) {
            if (element % 2 == 0) {
                sumEven += element;
            } else {
                sumOdd += element;
            }
        }
        System.out.printf("%d", sumEven - sumOdd);
    }
}
