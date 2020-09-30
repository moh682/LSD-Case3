package booking.entity;

public class Place {

    private String name;

    private Address address;

    private boolean active;

    public Place(String name, Address address, boolean active) {
        this.name = name;
        this.address = address;
        this.active = active;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
