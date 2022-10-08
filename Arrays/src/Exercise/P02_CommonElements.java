package Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");

        String [] secondArr = scanner.nextLine().split(" ");

        String output = "";

        for (String element: secondArr) {

            for (int i = 0; i < firstArr.length; i++) {

                if (element.equals(firstArr[i])){
                    output += element + " " ;
                }
            }
        }
        System.out.println(output);
    }
}
