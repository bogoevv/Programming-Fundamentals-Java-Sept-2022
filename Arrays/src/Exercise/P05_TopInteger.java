package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numberArr.length; i++) {
            boolean topInteger = true;

            for (int number = i + 1; number < numberArr.length ; number++) {
                if (numberArr[i] <= numberArr[number]) {
                    topInteger = false;
                    break;
                }
            }
            if (topInteger){
                System.out.printf("%d ",numberArr[i]);
            }
        }
    }
}
