package booking.entity;

import java.util.Date;

public class Employee extends Person implements java.io.Serializable{

    private String username;

    private transient String password;

    public Employee(){}

    public Employee(String name, Address address, String email, Date dateOfBirth, int socialSecurityNumber, boolean active, String username, String password) {
        super(name, address, email, dateOfBirth, socialSecurityNumber, active);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
