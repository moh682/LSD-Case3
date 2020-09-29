package booking;

import booking.dto.BookingDetails;
import booking.dto.BookingIdentifier;
import booking.dto.Car;
import booking.dto.PickUpPlace;

import java.time.LocalDateTime;
import java.util.List;

public interface Contract  {
    public BookingDetails findBooking(BookingIdentifier bookingIdentifier);
    public List<Car> listAvailableCars(PickUpPlace pickUpPlace, PickUpPlace deliveryPlaceDTO, LocalDateTime pickUpTime, LocalDateTime deliveryTime);
}
