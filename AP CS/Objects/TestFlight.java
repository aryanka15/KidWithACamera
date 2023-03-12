package YoutubeVideos.Objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

// TestFlight.java
// by Aryan Karani
// Period 2
// 04/11/2022

public class TestFlight {

    public static void main(String[] args) {
        
        Random gen = new Random();

        ArrayList<Flight> testFlightIDS = new ArrayList<>();
        ArrayList<LocalDateTime> timesForTesting = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            timesForTesting.add(LocalDateTime.of(gen.nextInt(20) + 2022, gen.nextInt(12) + 1, gen.nextInt(28) + 1, gen.nextInt(24), gen.nextInt(60), gen.nextInt(60)));
        }

        for (int j = 0; j < 10; j++) {
            LocalDateTime time = timesForTesting.get(j);
            testFlightIDS.add(new Flight(time, LocalDateTime.of(time.getYear(), time.getMonth(), gen.nextInt(28) + 1, time.getHour(), time.getMinute(), time.getSecond()), "LAX", "SEA", "Delta", gen.nextInt(100) + 100));
        }

        Airport delta = new Airport(testFlightIDS, 100, "Delta");
        System.out.println(delta);
        delta.addFlight(new Flight(LocalDateTime.now(), LocalDateTime.now().plusHours(12), "SEA", "IHA", "United", 200));
        System.out.println(delta);
        delta.delayFlight(delta.getFlights().get(2), 5, 2);
        System.out.println(delta);
        delta.delayFlight(2, 2, 5);
        System.out.println(delta);
        delta.deleteFlight(delta.flights.get(3));
        delta.deleteFlight(6);
        System.out.println(delta);
    }
}