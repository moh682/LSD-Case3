package booking.dto;

public class BookingDetails extends BookingIdentifier {

    private CarSummary car;
    private DriverDetails driverDetails;
    private BookingCriteria bookingCriteria;
    private Double fee;

    public BookingDetails(int id, CarSummary car, DriverDetails driverDetails, BookingCriteria bookingCriteria, Double fee) {
        super(id);
        this.car = car;
        this.driverDetails = driverDetails;
        this.bookingCriteria = bookingCriteria;
        this.fee = fee;
    }

    public BookingDetails(int id, CarSummary car, DriverDetails driverDetails, BookingCriteria bookingCriteria) {
        super(id);
        this.car = car;
        this.driverDetails = driverDetails;
        this.bookingCriteria = bookingCriteria;
    }

    public CarSummary getCar() {
        return car;
    }

    public void setCar(CarSummary car) {
        this.car = car;
    }

    public DriverDetails getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(DriverDetails driverDetails) {
        this.driverDetails = driverDetails;
    }

    public BookingCriteria getBookingCriteria() {
        return bookingCriteria;
    }

    public void setBookingCriteria(BookingCriteria bookingCriteria) {
        this.bookingCriteria = bookingCriteria;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
