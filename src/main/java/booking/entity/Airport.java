package booking.entity;

import java.util.Date;

public class Airport extends Place {

    private String IATA;

    public Airport(){}

    public Airport(String name, Address address, boolean active, String IATA) {
        super(name, address, active);
        this.IATA = IATA;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }
}
