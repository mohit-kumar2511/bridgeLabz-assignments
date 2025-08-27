import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date format:dd-mm-yyyy");
        String s=sc.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date=LocalDate.parse(s,f);
        System.out.println("current date"+date);
        LocalDate pdate=date.plusDays(15);
        System.out.println("date afteer 15 days addition"+pdate);
        LocalDate mdate=date.plusMonths(5);
        System.out.println("date after addition 5 months"+mdate);
    }
}
