package booking.entity;

public class Car implements java.io.Serializable{

    private String vin;
    private String licensePlate;
    private Type type;
    private double price;
    private int noOfSeats;
    private transient boolean active;

    public Car(){}

    public Car(String vin, String licensePlate, Type type, double price, int noOfSeats, boolean active) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.type = type;
        this.price = price;
        this.noOfSeats = noOfSeats;
        this.active = active;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
