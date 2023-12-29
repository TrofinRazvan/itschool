package ro.itschool.sessions.session8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UtilityClassesPractice {

    public static void main(String[] args) {
        Object object = new Object();

        LocalDate localDateNow = LocalDate.now();
        LocalDate date = LocalDate.of(2023, 02, 20);

//        System.out.println(localDateNow.isAfter(date));
//        System.out.println(localDateNow.isBefore(date));

//        System.out.println(localDateNow.plusYears(20));
//        System.out.println(localDateNow.minusYears(10));

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDate localDate = localDateTimeNow.toLocalDate();
//        System.out.println(localDateTimeNow);
//        System.out.println(localDate);

        ZonedDateTime zone = ZonedDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
//        System.out.println(zone);
//        System.out.println(offsetDateTime);

        ZoneId japanZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japanTime = ZonedDateTime.now(japanZone);
//        System.out.println("Current time in Japan: " + japanTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(localDateTimeNow.format(dateTimeFormatter));

        Date utilDate = new Date();
//        System.out.println("Util Date: " + utilDate);

        long timeStampNow = 1677127435 * 1000L;
        Date sqlDate = new java.sql.Date(timeStampNow);
//        System.out.println("SQL Date: " + sqlDate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number:");
        int userInput = scanner.nextInt();
        System.out.println("User input: " + userInput);

        Random random = new Random();
        int randomNumber = random.nextInt(userInput);
        System.out.println("Random number is: " + randomNumber);

        scanner.close();
    }
}