import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question1 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        LocalTime ctime = LocalTime.now();
        System.out.println("Current Time: " + ctime);
        ZonedDateTime ctime2=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + ctime2);
        ZonedDateTime ctime3=ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(ctime3);

    }
}