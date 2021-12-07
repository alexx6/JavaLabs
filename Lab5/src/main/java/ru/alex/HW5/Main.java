package ru.alex.HW5;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate lincolnBD, lincolnDD;
        lincolnBD = LocalDate.of(1809, 2, 12);
        lincolnDD = LocalDate.of(1855, 4, 15);
        System.out.println("Abe Lincoln");
        System.out.println("How old when he died? " + Period.between(lincolnBD, lincolnDD).getYears());
        System.out.println("How many days did he live? " + Period.between(lincolnBD, lincolnDD).getDays());

        System.out.println();

        LocalDate cumberBD;
        System.out.println("Bennedict Cumberbatch");
        cumberBD = LocalDate.of(1976, 7, 19);
        System.out.println("Born in a leap year? " + Year.isLeap(cumberBD.getYear()));
        System.out.println("How many days in the year he was born? " + (Year.isLeap(cumberBD.getYear()) ? 366 : 365));
        System.out.println("How many decades old is he? " + Period.between(cumberBD, LocalDate.now()).getYears() / 10);
        System.out.println("What was the day of the week on his 21st birthday? " + cumberBD.plusYears(21).getDayOfWeek());

        System.out.println();

        LocalTime trainD, trainA;
        trainD = LocalTime.of(1, 45);
        trainA = LocalTime.of(7, 25);
        System.out.println("Train departs Boston at 1:45PM and arrives New York 7:25PM");
        System.out.println("How many minutes long is the train ride? " + Duration.between(trainD, trainA).toMinutes());
        System.out.println("If the train was delayed 1 hour 19 minutes, what is the actual arrival time? " + trainA.plusHours(1).plusMinutes(19));

        System.out.println();

        LocalDateTime planeD, planeA;
        LocalTime flightD;
        planeD = LocalDateTime.of(LocalDate.now().getYear(), 3, 24, 21, 15);
        flightD = LocalTime.of(4, 15);
        planeA = planeD.plusHours(flightD.getHour()).plusMinutes(flightD.getMinute());
        System.out.println("Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes");
        System.out.println("When does it arrive in Miami? " + planeA);
        System.out.println("When does it arrive if the flight is delays 4 hours 27 minutes? " + planeA.plusHours(4).plusMinutes(27));

        System.out.println();

        LocalDate schoolS = LocalDate.of(LocalDate.now().getYear(), 9, 1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.TUESDAY));
        System.out.println("School semester starts the second Tuesday of September of this year.");
        System.out.println("What is the date? " + schoolS);
        LocalDate schoolE = LocalDate.of(schoolS.getYear() + 1, 6, 25);
        int daysOfSchool = 0;
        for (LocalDate i = schoolS; !i.equals(schoolE); i = i.plusDays(1)) {
            if (i.getDayOfWeek() != DayOfWeek.SATURDAY
                    && i.getDayOfWeek() != DayOfWeek.SUNDAY) daysOfSchool++;
        }
        daysOfSchool -= 20;
        System.out.println("How many days of school are there? " + daysOfSchool);

        System.out.println();

        System.out.println("A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.");
        System.out.println("What is the time of the week's meetings? " +
                LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 30))
                        .with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));


        System.out.println();

        ZoneId zBoston = ZoneId.of("America/New_York");
        ZoneId zSF = ZoneId.of("America/Los_Angeles");
        ZoneId zBengaluru = ZoneId.of("Asia/Calcutta");
        System.out.println("Flight 123, San Francisco to  Boston, leaves SFO at 10:30 PM June 13, 2014");
        System.out.println("What is the local time in Boston when the flight takes off? " +
                ZonedDateTime.of(LocalDate.of(2014, 6, 13), LocalTime.of(22, 30), zSF)
                        .withZoneSameInstant(zBoston).toLocalTime());
        System.out.println("What is the local time at Boston Logan airport when the flight arrives? " +
                ZonedDateTime.of(LocalDate.of(2014, 6, 13), LocalTime.of(22, 30), zSF)
                        .plusHours(5).plusMinutes(30)
                        .withZoneSameInstant(zBoston).toLocalTime());
        System.out.println("What is the local time in San Francisco when the flight arrives? " +
                ZonedDateTime.of(LocalDate.of(2014, 6, 13), LocalTime.of(22, 30), zSF)
                        .plusHours(5).plusMinutes(30).toLocalTime());

        System.out.println();

        System.out.println("Flight 456, San Francisco to Bangalore, India, leaves SFO at Saturday, 10:30 PM June 28, 2014");
        ZonedDateTime sfD = ZonedDateTime.of(LocalDate.of(2014, 6, 28), LocalTime.of(22, 30), zSF);
        ZonedDateTime meeting = ZonedDateTime.of(LocalDate.of(2014, 6, 30), LocalTime.of(9, 0), zBengaluru);
        System.out.println("Will the traveler make a meeting in Bangalore Monday at 9 AM local time? " +
                (sfD.plusHours(22).isBefore(meeting) ? "Yes" : "No"));
        System.out.println("Can the traveler call her husband at a reasonable time when she arrives? " +
                ((sfD.plusHours(22).toLocalTime().isAfter(LocalTime.of(9, 0))
                        && sfD.plusHours(22).toLocalTime().isBefore(LocalTime.of(21, 0))) ? "Yes" : "No"));

        System.out.println();

        System.out.println("Flight 123, San Francisco to Boston, leaves SFO at 10:30 PM Saturday, November 1st, 2014");
        System.out.println("What day and time does the flight arrive in Boston? " +
                ZonedDateTime.of(LocalDate.of(2014, 11, 1), LocalTime.of(22, 30), zSF)
                        .plusHours(5).plusMinutes(30).withZoneSameInstant(zBoston).toLocalDateTime());
        System.out.println("What happened? " + "Winter time");
    }
}
