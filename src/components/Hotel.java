package components;

public class Hotel implements ITravelComponent {
    private String hotelName;
    private int nights;

    public Hotel(String hotelName, int nights) {
        this.hotelName = hotelName;
        this.nights = nights;
    }

    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public void book() {
        System.out.println("Hotel booked: " + hotelName + " for " + nights + " nights");
    }
}

