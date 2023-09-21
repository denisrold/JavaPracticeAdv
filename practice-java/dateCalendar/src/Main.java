import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Dates
        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER,21);
        System.out.println(date);
        //Times
        LocalTime time = LocalTime.of(17,43);
        System.out.println(time);
        //DateTime --> tiene un objeto con el tiempo y un objeto con la fecha.
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, Month.SEPTEMBER,21,17,43);
        System.out.println(dateTime);
        System.out.println(dateTime2);
        //para restarle
        LocalDateTime newDateTime = dateTime.minusDays(7);
        System.out.println(newDateTime);
        //sumarle
        LocalDateTime newDateTime2 =dateTime.plusDays(7);
        System.out.println(newDateTime);

        //Formatear la fecha
        String dateFormat = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(dateFormat);
    }
}