package Exercise;


import java.util.Objects;
import java.util.Scanner;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChestArr = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        //Gold|Silver|Bronze|Medallion|Cup
        //Loot Wood Gold Coins

        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {
                String[] lootArr = command.split(" ");
                for (int i = 1; i < lootArr.length; i++) {
                    boolean alreadyContained = false;
                    for (String s : treasureChestArr) {
                        if (Objects.equals(lootArr[i], s)) {
                            alreadyContained = true;
                            break;
                        }
                    }
                    if (!alreadyContained) {
                        String[] newChest = new String[treasureChestArr.length + 1];
                        newChest[0] = lootArr[i];

                        System.arraycopy(treasureChestArr, 0, newChest, 1, newChest.length - 1);
                        treasureChestArr = newChest;
                    }
                }
            } else if (command.contains("Drop")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (index < 0 || index > treasureChestArr.length - 1) {

                } else {

                    String droppedElement = treasureChestArr[index];

                    for (int i = index; i < treasureChestArr.length - 1; i++) {
                        treasureChestArr[i] = treasureChestArr[i + 1];
                    }
                    treasureChestArr[treasureChestArr.length - 1] = droppedElement;
                }
            } else if (command.contains("Steal")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int arrLength = treasureChestArr.length;

                if (arrLength - index <= 0) {
                    for (int i = 0; i < treasureChestArr.length; i++) {
                        if (i != treasureChestArr.length - 1) {
                            System.out.printf("%s, ", treasureChestArr[i]);
                        } else {
                            System.out.printf("%s%n", treasureChestArr[i]);
                        }
                    }
                    String[] tempArr = new String[0];
                    treasureChestArr = tempArr;
                } else {
                    for (int i = treasureChestArr.length - index; i < treasureChestArr.length; i++) {
                        if (i != treasureChestArr.length - 1) {
                            System.out.printf("%s, ", treasureChestArr[i]);
                        } else {
                            System.out.printf("%s%n", treasureChestArr[i]);
                        }
                    }
                    String[] newChest = new String[treasureChestArr.length - index];
                    for (int i = 0; i < arrLength - index; i++) {
                        newChest[i] = treasureChestArr[i];
                    }
                        treasureChestArr = newChest;
                    }
                }

                command = scanner.nextLine();
            }
            int sum = 0;
            for (String item : treasureChestArr) {
                int itemPoints = item.length();
                sum += itemPoints;
            }
            double averageTreasureGain = (double) sum / treasureChestArr.length;

            if (sum > 0) {
                System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
            } else {
                System.out.println("Failed treasure hunt.");
            }

        }
    }
