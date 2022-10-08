package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sequenceCounter = 1;
        int maxSequenceCounter = Integer.MIN_VALUE;
        // input: 1 1 1 2 3 1 3 3

        for (int number = 0; number < numbersArr.length - 1; number++) {

            if (numbersArr[number] == numbersArr[number + 1]) {
                sequenceCounter++;
                if (sequenceCounter > maxSequenceCounter) {
                    maxSequenceCounter = sequenceCounter;
                }
            } else {
                sequenceCounter = 1;
            }
        }
        sequenceCounter = 1;
        for (int index = 0; index < numbersArr.length - 1; index++) {
            if (numbersArr[index] == numbersArr[index + 1]) {
                sequenceCounter++;
            } else {
                sequenceCounter = 1;
            }
            if (sequenceCounter == maxSequenceCounter) {
                for (int inIndex = (index + 1) - (maxSequenceCounter - 1); inIndex <= index + 1; inIndex++) {
                    System.out.printf("%d ",numbersArr[inIndex]);
                }
                break;
            }
        }
    }
}





