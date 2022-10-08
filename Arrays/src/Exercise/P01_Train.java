package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonsNumber = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonsNumber];
        int totalPassengers = 0;

        for (int i = 0; i < wagonsNumber; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            train [i] = passengers;
            totalPassengers += passengers;
        }
        for (int i = 0; i < train.length; i++) {
            System.out.printf("%d ",train[i]);
        }
        System.out.println();
        System.out.println(totalPassengers);
    }
}
