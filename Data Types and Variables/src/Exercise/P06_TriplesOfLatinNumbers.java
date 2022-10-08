package Exercise;

import java.util.Scanner;

public class P06_TriplesOfLatinNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int lettersNumber = Integer.parseInt(scanner.nextLine());

        for (int firstLetter = 97; firstLetter < 97 + lettersNumber; firstLetter++) {
            char firstSymbol = (char) firstLetter;
            for (int secondLetter = 97; secondLetter <  97 + lettersNumber ; secondLetter++) {
                char secondSymbol = (char) secondLetter;
                for (int thirdLetter = 97; thirdLetter < 97 + lettersNumber; thirdLetter++) {
                        char thirdSymbol = (char) thirdLetter;
                    System.out.printf("%c%c%c%n",firstSymbol,secondSymbol,thirdSymbol);
                }
            }
        }
    }
}
