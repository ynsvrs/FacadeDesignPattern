public class TravelAgentImplementation implements ITravelAgent{
    public FlightInfo getFlightDetails() {
        FlightBooking fb = new FlightBooking();
        return (FlightInfo) fb.getBookingDetails();
    }

    public HotelInfo getHotelDetails() {
        HotelBooking hb = new HotelBooking();
        return (HotelInfo) hb.getBookingDetails();
    }

    public CarRentalInfo getCarDetails() {
        CarRentalBooking cb = new CarRentalBooking();
        return (CarRentalInfo) cb.getBookingDetails();
    }
}
