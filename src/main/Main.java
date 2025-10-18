package main;

import components.Flight;
import components.Hotel;
import components.CarRental;
import facade.TravelBookingFacade;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Emirates", "EK202");
        Hotel hotel = new Hotel("Hilton", 3);
        CarRental carRental = new CarRental("Hertz", "BMW");

        TravelBookingFacade travelFacade = new TravelBookingFacade(flight, hotel, carRental);


        travelFacade.bookTrip();

        travelFacade.getHotel().setNights(5);
        travelFacade.getCarRental().setCarType("Bentley");

        System.out.println("\nAfter updating hotel nights and car type:");
        travelFacade.bookTrip();
    }
}
