package YoutubeVideos.Objects;

import java.time.*; 
// Flight.java
// by Aryan Karani
// Period 2 
// 03/22/2022

// Program for the Objects video
// Description: Will contain Departure time, Arrival time, 
// Departure Location, Arrival Location, Airline name, passenger capacity, flight id 

public class Flight {

    // INSTANCE VARIABLES - What the object stores
    
    private LocalDateTime departure; // stores date and time
    private LocalDateTime arrival;

    private String departingFrom; // stores string values representing the city of departure and arrival
    private String flyingTo;      // for the flight

    private String airline; // airline of flight

    private int passengerCount;
    private int passengerCapacity; 
    private int flightId;
    private static int nextFlightId = 0;
    
    // CONSTRUCTORS - the "method" you call to get the object initialized, can have more than one

    public Flight(LocalDateTime departure, LocalDateTime arrival, String departingFrom, String flyingTo, String airline, int passengerCapacity) {
        this.departure = departure; // initializing values passed in 
        this.arrival = arrival;
        this.departingFrom = departingFrom;
        this.flyingTo = flyingTo;
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = 0;
        this.flightId = nextFlightId; // initialize to zero, assuming brand new flight created
        setNextFlightId();
    }

    // ACCESSOR METHODS - used to get copies of the instance variables, only needed if they are private

    public LocalDateTime getDepature() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public String getDepartingCity() {
        return departingFrom;
    }

    public String getArrivalCity() {
        return flyingTo;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getFlightId() {
        return flightId;
    }

    // MODIFIER METHODS - Used to modify the object and it's instance variables
    // Must use a static method in order to change an instance variable initialized as static

    public void delayFlight(int days, int hours) { // delays the flight
        departure = departure.plusDays(days);
        departure = departure.plusHours(hours);
        arrival = arrival.plusDays(days);
        arrival = arrival.plusHours(hours);
    }

    public void incrementPassengers(int passengersToAdd) { // adds a user-determined amount of passengers
        passengerCount+=passengersToAdd;
    }

    public void addNewPassenger() { // adds a new passenger
        incrementPassengers(1);
    }

    public void switchAirline(String airline) { // switches the airline the flight will take
        this.airline = airline;
    }

    public static void setNextFlightId(){ // increments the flightid for the next flight
        nextFlightId++;
    }

    // TO STRING - defines how the object is represented as a String

    public String toString() { // ex. Flight - United 23: Departing from SEA on 4/11/2022 at 4:32 and arriving at LAX on 4/12/2022 at 14:24
        return "Flight - " + airline + " " + flightId + "\nDeparting from - " + departingFrom + " on " + departure.getMonthValue() + "/" + 
        departure.getDayOfMonth() + "/" + departure.getYear() + " at " + departure.getHour() + ":" + 
        departure.getMinute() + " and arriving at " + flyingTo + " on " + arrival.getMonthValue() + "/" + 
        arrival.getDayOfMonth() + "/" + arrival.getYear() + " at " + arrival.getHour() + ":" + arrival.getMinute();
    }
}