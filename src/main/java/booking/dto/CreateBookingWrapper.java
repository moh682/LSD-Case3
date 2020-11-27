package booking.dto;

public class CreateBookingWrapper {

    private BookingCriteria bookingCriteria;
    private Double price;
    private DriverDetails driverDetails;
    private EmployeeDetails employeeDetails;
    private CarSummary carSummary;

    public CreateBookingWrapper() {}

    public CreateBookingWrapper(BookingCriteria bookingCriteria, Double price, DriverDetails driverDetails, EmployeeDetails employeeDetails, CarSummary carSummary) {
        this.bookingCriteria = bookingCriteria;
        this.price = price;
        this.driverDetails = driverDetails;
        this.employeeDetails = employeeDetails;
        this.carSummary = carSummary;
    }

    public BookingCriteria getBookingCriteria() {
        return bookingCriteria;
    }

    public void setBookingCriteria(BookingCriteria bookingCriteria) {
        this.bookingCriteria = bookingCriteria;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DriverDetails getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(DriverDetails driverDetails) {
        this.driverDetails = driverDetails;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public CarSummary getCarSummary() {
        return carSummary;
    }

    public void setCarSummary(CarSummary carSummary) {
        this.carSummary = carSummary;
    }

    @Override
    public String toString() {
        return "CreateBookingWrapper{" +
                "bookingCriteria=" + bookingCriteria +
                ", price=" + price +
                ", driverDetails=" + driverDetails +
                ", employeeDetails=" + employeeDetails +
                ", carSummary=" + carSummary +
                '}';
    }
}
