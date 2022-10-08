package Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayYield = Integer.parseInt(scanner.nextLine());
        int totalYield = 0;

        int dayCounter = 0;
        while (dayYield >= 100){
            totalYield += dayYield - 26;
            dayYield -= 10;
            dayCounter ++ ;
        }
        totalYield -= 26;

        System.out.println(dayCounter);
        System.out.println(totalYield);
    }
}
