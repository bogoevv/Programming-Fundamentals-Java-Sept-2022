package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {     // swap 0 1   // 1 2 3 4
            if (command.contains("swap")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numbersArr[index1]; // [1] 2 3 4
                int element2 = numbersArr[index2];//   1 [2] 3 4

                numbersArr[index1] = element2;
                numbersArr[index2] = element1;


            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numbersArr[index1]; // [1] 2 3 4
                int element2 = numbersArr[index2];//   1 [2] 3 4

                numbersArr[index1] = element1 * element2;
            } else if (command.equals("decrease")) {
                for (int index = 0; index < numbersArr.length; index++) {
                    numbersArr[index] -= 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index < numbersArr.length; index++) {
            if (index < numbersArr.length -1){
                System.out.printf("%d, ",numbersArr[index]);
            }else {
                System.out.printf("%d",numbersArr[index]);
            }
        }
    }
}
