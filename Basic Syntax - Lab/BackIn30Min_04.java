import java.util.Scanner;

public class BackIn30Min_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 30;

        if (minutes > 59){
            hours ++;
            minutes = minutes % 60;
        }
        if ( hours > 23){
            hours = 0;
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
