package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number = 0; number < numbersArr.length; number++) {
            int leftSum = 0;
            int rightSum = 0;

            if (number != 0) {
                for (int i = 0; i < number; i++) {
                    leftSum += numbersArr[i];
                }
            }

            if (number != numbersArr.length - 1){
                for (int i = number + 1; i < numbersArr.length ; i++) {
                    rightSum += numbersArr[i];
                }
            }
            if (leftSum == rightSum){
                System.out.println(number);
                return;
            }
        }
        System.out.println("no");
    }
}
