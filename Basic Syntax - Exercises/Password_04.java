package Exercises;

import java.util.Scanner;

public class Password_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        String password = "";
        int numberOfTries = 0;

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol ;
        }

        String enteredPassword = scanner.nextLine();


        while (!enteredPassword.equals(password)){

            numberOfTries ++;
            if (numberOfTries == 4){
                System.out.printf("User %s blocked!%n",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
