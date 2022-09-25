package Exercises;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCounter = 0;
        int mouseCounter = 0;
        int keyboardCounter = 0;
        int displayCounter = 0;

        for (int i = lostGames; i > 0; i --) {
            if (i % 2 == 0){
                headsetCounter ++;
            }
            if (i % 3 == 0){
                mouseCounter ++;
            }
            if (i % 6 == 0){
                keyboardCounter ++;
            }
            if (i % 12 == 0){
                displayCounter ++;
            }
        }
        double totalPrice = (mousePrice * mouseCounter)
                + (headsetPrice * headsetCounter)
                +(keyboardPrice * keyboardCounter)
                +(displayPrice * displayCounter);

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);
    }
}
