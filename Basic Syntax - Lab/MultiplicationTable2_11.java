    import java.util.Scanner;

    public class MultiplicationTable2_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int input = Integer.parseInt(scanner.nextLine());
            int times = Integer.parseInt(scanner.nextLine());
            boolean isValid = true;

            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", input, times, input * times);
                times++;
                isValid = false;
            }
                if (times > 10 && isValid) {
                    System.out.printf("%d X %d = %d%n", input, times, input * times);
                }
            }
        }
