package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensedArr = new int[numbersArr.length - 1];

        while (numbersArr.length > 1) {
            int[] newCondensedArr = new int[condensedArr.length -1];
            for (int index = 0; index < numbersArr.length - 1; index++) {

                condensedArr[index] = numbersArr[index] + numbersArr[index + 1];
            }
            numbersArr = condensedArr;
            condensedArr = newCondensedArr;
        }
        System.out.printf("%d",numbersArr[0]);
    }
}