package booking.dto;

public class BookingDetails extends BookingIdentifier {
    private CarSummary car;
    private DriverDetails driverDetails;

    public BookingDetails(int id, CarSummary car, DriverDetails driverDetails) {
        super(id);
        this.car = car;
        this.driverDetails = driverDetails;
    }
    
}
