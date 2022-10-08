package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int firstNumber = inputArr[0];

            for (int index = 0; index < inputArr.length - 1; index++) {

                inputArr [ index] = inputArr [ index + 1];
            }
            inputArr [inputArr.length - 1] = firstNumber;
        }
        for (int number:inputArr) {
            System.out.printf("%d ",number);
        }
    }
}
