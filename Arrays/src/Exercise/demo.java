package Exercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChestArr = scanner.nextLine().split(" ");
        int index = Integer.parseInt(scanner.nextLine());


        int arrLength = treasureChestArr.length;
        for (int i = treasureChestArr.length - index ; i < treasureChestArr.length ; i++) {
            if (i != treasureChestArr.length -1){
                System.out.printf("%s, ", treasureChestArr[i]);
            } else {
                System.out.printf("%s%n", treasureChestArr[i]);
            }
        }
        String [] newChest = new String[treasureChestArr.length - 1];
        for (int i = 0; i < arrLength - index  ; i++) {
            newChest[i] = treasureChestArr[i];
        }
        if (arrLength - index == 0){
            String [] tempArr =new String[0];
            treasureChestArr = tempArr;
        }
    }
}
