import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DateDay {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Date of Birth (month, day, year)");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();


        System.out.println(findDay(month, day, year));

        scanner.close();
    }
}
