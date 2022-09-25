import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalValue = 0;

        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0){
                totalValue += i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d",totalValue);
        }
    }

