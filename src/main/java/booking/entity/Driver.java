package booking.entity;

import java.util.Date;

public class Driver extends Person {

    private long licenseNo;

    public Driver(String name, Address address, String email, Date dateOfBirth, int socialSecurityNumber, boolean active, long licenseNo) {
        super(name, address, email, dateOfBirth, socialSecurityNumber, active);
        this.licenseNo = licenseNo;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }
}