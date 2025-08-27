import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        LocalDate d1=LocalDate.parse(s1,f);
        LocalDate d2=LocalDate.parse(s2,f);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));
    }
}
