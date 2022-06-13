package first_part;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TenthChallenge {
    //https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the month -int-");
        Integer month = scanner.nextInt();
        System.out.println("Please introduce the day-int-");
        Integer day = scanner.nextInt();
        System.out.println("Please introduce the year -int-");
        Integer year = scanner.nextInt();
        System.out.println(findDay(month, day, year));
    }


    public static String findDay(int month, int day, int year) {
        Date date = new Date();
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();

    }
}
