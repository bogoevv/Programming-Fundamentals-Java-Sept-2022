package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int number = 0; number < numbersArr.length; number++) {
            for (int index = numbersArr.length -1 ; index > number; index--) {
                if (numbersArr[number] + numbersArr [index] == magicSum){
                    System.out.printf("%d %d%n",numbersArr[number],numbersArr[index]);
                }
            }

        }
    }
}
