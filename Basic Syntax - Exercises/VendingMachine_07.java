package Exercises;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                sum += coins;
            }
            input = scanner.nextLine();
        }
            input = scanner.nextLine();

        while (!input.equals("End")){
            switch (input) {
                case "Nuts":
                    sum -= 2;
                    if (sum < 0) {
                        sum += 2;
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    sum -= 0.7;
                    if (sum < 0) {
                        sum += 0.7;
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    sum -= 1.5;
                    if (sum < 0) {
                        sum += 1.5;
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    sum -= 0.8;
                    if (sum < 0) {
                        sum += 0.8;
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    sum -= 1;
                    if (sum < 0) {
                        sum += 1;
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}

