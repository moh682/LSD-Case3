package booking.dto;

public class BookingDetails extends BookingIdentifier {

    private CarSummary car;
    private DriverDetails driverDetails;
    private BookingCriteria bookingCriteria;
    private EmployeeDetails employeeDetails;
    private Double fee;
    private Double price;

    public BookingDetails(Long id, CarSummary car, DriverDetails driverDetails, EmployeeDetails employeeDetails, BookingCriteria bookingCriteria, Double fee, Double price) {
        super(id);
        this.car = car;
        this.driverDetails = driverDetails;
        this.employeeDetails = employeeDetails;
        this.bookingCriteria = bookingCriteria;
        this.fee = fee;
        this.price = price;
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
