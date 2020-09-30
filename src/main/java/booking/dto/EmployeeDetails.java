package booking.dto;

import booking.entity.Address;
import booking.entity.Employee;

import java.util.Date;

public class EmployeeDetails {

    private String name;

    private Address address;

    private String email;

    private Date dateOfBirth;

    private int socialSecurityNumber;


    public EmployeeDetails(Employee employee) {
        this.name = employee.getName();
        this.address = employee.getAddress();
        this.email = employee.getEmail();
        this.dateOfBirth = employee.getDateOfBirth();
        this.socialSecurityNumber = employee.getSocialSecurityNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
