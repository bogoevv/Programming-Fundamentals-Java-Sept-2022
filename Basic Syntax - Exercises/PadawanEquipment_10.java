package Exercises;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalLightsaberPrice = Math.ceil(students * 1.1) * lightsaberPrice;
        double totalRobePrice = students * robePrice;
        int freeBelts = students / 6;
        double totalBeltPrice = (students - freeBelts)*beltPrice;

        double totalPrice = totalBeltPrice + totalRobePrice + totalLightsaberPrice;

        if (budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else {
            double priceDifference = totalPrice - budget;
            System.out.printf("George Lucas will need %.2flv more.",priceDifference);
        }
    }
}
