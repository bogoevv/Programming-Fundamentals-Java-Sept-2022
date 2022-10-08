package Exercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        int halfPower = pokePowerN / 2;

        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            pokeCounter++;
            if (pokePowerN == halfPower && pokePowerN != 0 && exhaustionFactorY != 0) {
                    pokePowerN /= exhaustionFactorY;
            }
        }
        System.out.println(pokePowerN);
        System.out.println(pokeCounter);
    }
}
