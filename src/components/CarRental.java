package components;

public class CarRental implements ITravelComponent {
    private String company;
    private String carType;

    public CarRental(String company, String carType) {
        this.company = company;
        this.carType = carType;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void book() {
        System.out.println("Car booked: " + company + " - " + carType);
    }
}

