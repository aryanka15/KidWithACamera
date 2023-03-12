package YoutubeVideos.Objects;

import java.util.ArrayList;

// Airport.java
// by Aryan Karani
// Period 2
// 04/11/2022

// Program for the Objects video
// Will contain an ArrayList of Flights, name of airport

public class Airport {
    
    // INSTANCE VARIABLES

    ArrayList<Flight> flights; // List of flights
    ArrayList<Flight> delayedFlights; // List of delayed Flights
    int totalFlightCapacity; // the number of flights the airport can take
    String name; // name of airport

    // CONSTRUCTORS

    public Airport(ArrayList<Flight> flights, int totalFlightCapacity, String name) { // Constructor for pre-determined flights array
        this.flights = flights;
        this.delayedFlights = new ArrayList<>();
        this.totalFlightCapacity = totalFlightCapacity;
        this.name = name; 
    }

    public Airport(String name, int totalFlightCapacity) { // Constructor for empty flights array 
        this(new ArrayList<>(), totalFlightCapacity, name);
    }

    // ACCESSOR METHODS

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Flight> getDelayedFlights() {
        return delayedFlights;
    }

    public String getName() {
        return name; 
    }

    public int getTotalFlightCapacity() {
        return totalFlightCapacity;
    }

    

    // MODIFIER METHODS

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void delayFlight(Flight flight, int days, int hours) { // delay the flight
        flight.delayFlight(days, hours); // delays the flight using Flight method
        boolean delayed = false; 
        for (Flight tempFlight: delayedFlights) { // looks for the flight in delayed flights
            if (tempFlight.getFlightId() == flight.getFlightId()) { // if it finds it, it does nothing else
                delayed = true; 
            }
        }
        if (!delayed) { // if the flight is not previously delayed, move it to delayedFlights
            flights.remove(flight);
            delayedFlights.add(flight);
        }
    }

    public void delayFlight(int flightID, int days, int hours) { // delays the flight based on flight ID 
        for (Flight flight: flights) { // checks in the flight array for the flight, delays it if it was found
            if (flight.getFlightId() == flightID) {
                delayFlight(flight, days, hours);
                return; 
            }
        }
        for (Flight flight: delayedFlights) { // checks for the flight in the delayedFlights array, calls delayFlight on it from the Flight class if found
            if (flight.getFlightId() == flightID) {
                flight.delayFlight(days, hours);
                return;
            }
        }
    }

    public void deleteFlight(Flight flight) { // delets the flight using the object 
        if(!flights.remove(flight)) { // tries to remove flight from flights, if the flight is not found then remove from delayed flights
            delayedFlights.remove(flight);
        }
    }

    public void deleteFlight(int flightId) { // deletes the flight using the flightID, checking in both flights and delayedFlights
        for (Flight flight: flights) {
            if (flight.getFlightId() == flightId) {
                deleteFlight(flight);
                return;
            }
        }
        for (Flight flight: delayedFlights) {
            if (flight.getFlightId() == flightId) {
                deleteFlight(flight);
                return;
            }
        }
    }

    // TO STRING

    public String toString() { // String representation for Airport - ex. "Delta Airport \n LIST OF FLIGHTS \n \n Delayed Flights \n LIST OF DELAYED FLIGHTS"
        String toString = "";
        for (Flight flight: flights) {
            toString+=flight.toString() + "\n";
        }
        if (delayedFlights.size() != 0) {
            toString += "\nDelayed Flights\n";
            for (Flight flight: delayedFlights) {
                toString+=flight.toString() + "\n";
            }
        }
        
        return name + " Airport" + "\n" + toString;
    }

}