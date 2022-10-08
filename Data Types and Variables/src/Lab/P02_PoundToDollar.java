package Lab;

import java.util.Scanner;

public class P02_PoundToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pound=Float.parseFloat(scanner.nextLine());

        float dollar = pound * 1.36f;

        System.out.printf("%.3f",dollar);
    }
}
