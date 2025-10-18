package facade;

import components.Flight;
import components.Hotel;
import components.CarRental;

public class TravelBookingFacade {
    private Flight flight;
    private Hotel hotel;
    private CarRental carRental;

    public TravelBookingFacade(Flight flight, Hotel hotel, CarRental carRental) {
        this.flight = flight;
        this.hotel = hotel;
        this.carRental = carRental;
    }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public Hotel getHotel() { return hotel; }
    public void setHotel(Hotel hotel) { this.hotel = hotel; }

    public CarRental getCarRental() { return carRental; }
    public void setCarRental(CarRental carRental) { this.carRental = carRental; }

    public void bookTrip() {
        flight.book();
        hotel.book();
        carRental.book();
        System.out.println("All travel arrangements completed successfully!");
    }
}

