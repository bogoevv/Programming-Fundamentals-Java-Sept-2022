package Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int lines = Integer.parseInt(scanner.nextLine()); lines > 0 ; lines --) {

            char symbol = scanner.nextLine().charAt(0);

            sum += (int) symbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
