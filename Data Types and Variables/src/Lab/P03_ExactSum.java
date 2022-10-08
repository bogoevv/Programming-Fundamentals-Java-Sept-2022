package Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i <numbers ; i++) {
            BigDecimal inputNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(inputNumber);
        }
        System.out.println(sum);
    }
}
