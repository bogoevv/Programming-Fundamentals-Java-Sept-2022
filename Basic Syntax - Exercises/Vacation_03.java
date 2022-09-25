package Exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;
        double pricePerPerson = 0;

        switch (day){
            case "Friday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 8.45;
                        pricePerPerson = 8.45;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 10.9;
                        pricePerPerson = 10.9;
                        break;
                    case "Regular":
                    totalPrice = numberOfPeople * 15;
                        pricePerPerson = 15;
                    break;
                }break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 9.8;
                        pricePerPerson = 9.8;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 15.6;
                        pricePerPerson = 15.6;
                        break;
                    case "Regular":
                        totalPrice = numberOfPeople * 20;
                        pricePerPerson = 20;
                        break;
                }break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        totalPrice = numberOfPeople * 10.46;
                        pricePerPerson = 10.46;
                        break;
                    case "Business":
                        totalPrice = numberOfPeople * 16;
                        pricePerPerson = 16;
                        break;
                    case "Regular":
                        totalPrice = numberOfPeople * 22.5;
                        pricePerPerson = 22.5;
                        break;
                }break;
        }
        if (groupType.equals("Students") && numberOfPeople >= 30){
            totalPrice = totalPrice * 0.85;
        } else if (groupType.equals("Business") && numberOfPeople >= 100 ) {
            totalPrice = totalPrice - 10 * pricePerPerson ;
        } else if (groupType.equals("Regular" )&& numberOfPeople >= 10 && numberOfPeople <= 20)  {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
