    import java.util.Scanner;

    public class EvenNumber_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int input = Integer.parseInt(scanner.nextLine());

            boolean isEven = input % 2 == 0;

            while (!isEven){
                System.out.println("Please write an even number.");
                input = Integer.parseInt(scanner.nextLine());
                isEven = input % 2 == 0;
            }
            System.out.printf("The number is: %d",Math.abs(input));
        }
    }
