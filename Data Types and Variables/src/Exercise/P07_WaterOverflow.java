package Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTank = 0;
        for (int n =Integer.parseInt(scanner.nextLine()); 0 < n; n--) {
            int pouredWater = Integer.parseInt(scanner.nextLine());
            waterTank += pouredWater;
            if (waterTank > 255){
                waterTank -= pouredWater;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(waterTank);
    }
}
