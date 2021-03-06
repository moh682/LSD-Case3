package booking;

import booking.dto.*;
import booking.eto.UnavailableException;
import booking.eto.InvalidInputException;
import booking.eto.NotFoundException;
import booking.eto.PersistanceFailedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

public interface Contract extends Remote {

    /**
     * @param bookingCriteria
     * @return CarSummary
     * @throws NotFoundException
     * @throws InvalidInputException
     */
    Collection<CarSummary> listAvailableCars(BookingCriteria bookingCriteria) throws NotFoundException, InvalidInputException, RemoteException;

    /**
     *
     * @param bookingCriteria
     * @return fee
     * @throws InvalidInputException
     */
    Double calculateFee(BookingCriteria bookingCriteria) throws InvalidInputException, RemoteException;

    /**
     *
     * @param bookingCriteria
     * @param price
     * @param driverDetails
     * @param employeeDetails
     * @param carSummary
     * @return
     * @throws InvalidInputException
     */
    BookingDetails createBooking(BookingCriteria bookingCriteria, Double price, DriverDetails driverDetails, EmployeeDetails employeeDetails, CarSummary carSummary) throws InvalidInputException, RemoteException;

    /**
     *
     * @param bookingDetails
     * @return bookingDetails
     * @throws PersistanceFailedException
     * @throws UnavailableException
     */
    BookingDetails saveBooking(BookingDetails bookingDetails) throws PersistanceFailedException, UnavailableException, RemoteException;

    /**
     *
     * @param id
     * @return boolean
     * @throws PersistanceFailedException
     * @throws NotFoundException
     * @throws UnavailableException
     * @throws InvalidInputException
     */
    boolean cancelBooking(BookingIdentifier id) throws PersistanceFailedException, NotFoundException, UnavailableException, InvalidInputException, RemoteException;

    /**
     *
     * @param id
     * @return bookingDetails
     * @throws PersistanceFailedException
     * @throws NotFoundException
     * @throws UnavailableException
     * @throws InvalidInputException
     */
    BookingDetails endBooking(BookingIdentifier id) throws PersistanceFailedException, NotFoundException, UnavailableException, InvalidInputException, RemoteException;

    /**
     *
     * @param id
     * @return bookingDetails
     * @throws NotFoundException
     * @throws InvalidInputException
     */
    BookingDetails findBooking(BookingIdentifier id) throws NotFoundException, InvalidInputException, RemoteException;
}
