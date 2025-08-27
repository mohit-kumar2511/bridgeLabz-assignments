import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  //  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
   DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
   // String s=sc.nextLine();
   String s1=sc.nextLine();
   // LocalDate l1=LocalDate.parse(s,f);
    LocalDate l2=LocalDate.parse(s1,f2);
    //System.out.println(l1);
    System.out.println(l2);
    }
}
