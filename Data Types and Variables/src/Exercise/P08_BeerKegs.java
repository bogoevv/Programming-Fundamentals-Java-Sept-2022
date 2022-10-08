package Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsNumber = Integer.parseInt(scanner.nextLine());
        double largestKegVolume = Double.MIN_VALUE;
        String largestKegName = "";

        for (int i = 0; i < kegsNumber; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.pow(radius,2) * height * Math.PI;

            if (volume > largestKegVolume){
                largestKegVolume = volume;
                largestKegName = kegModel ;
            }
        }
        System.out.println(largestKegName);
    }
}
