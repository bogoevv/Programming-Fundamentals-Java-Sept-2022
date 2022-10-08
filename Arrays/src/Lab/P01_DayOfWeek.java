    package Lab;

    import java.util.Scanner;

    public class P01_DayOfWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String daysOfWeekArr[] = {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday"
            };
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 7 && n > 0) {
                System.out.println(daysOfWeekArr[n - 1]);
            }else {
                System.out.println("Invalid day!");
            }
        }
    }
