package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();

        int[] numbersArr = Arrays
                .stream(values.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0 ;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0){
                sum += numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
