package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {

            int [] inputArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if ((i + 1) % 2 != 0){
                firstArr[i]=inputArr [0];
                secondArr[i] = inputArr [1];
            }else {
                firstArr[i]=inputArr [1];
                secondArr[i] = inputArr [0];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",firstArr[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",secondArr[i]);
        }
    }
}
