public class Main {
    public static void main(String[] args) {
        ITravelAgent agent = new TravelAgentImplementation();

        FlightInfo flight = agent.getFlightDetails();
        HotelInfo hotel = agent.getHotelDetails();
        CarRentalInfo car = agent.getCarDetails();

        System.out.println(" Helloooo, this is your Travel Booking Summary: ");
        flight.showInfo();
        hotel.showInfo();
        car.showInfo();
    }
}