import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int i = 1;
        while (i <= 10) {
            int result = input * i ;
            System.out.printf("%d X %d = %d%n", input, i, result);
            i++;
        }
    }
}