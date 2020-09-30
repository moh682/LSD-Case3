package booking.dto;

import booking.entity.Driver;

public class DriverDetails {

    private Driver driver;

    private long licenseNo;

    public DriverDetails(Driver driver, long licenseNo) {
        this.driver = driver;
        this.licenseNo = licenseNo;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }
}
