package booking.dto;

import booking.entity.Driver;

public class DriverDetails {

    private Driver driver;

    public DriverDetails(){}

    public DriverDetails(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
