package tracker;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println(currentDateAndTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm:ss");
        String currentDateTimeFormat = currentDateAndTime.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}