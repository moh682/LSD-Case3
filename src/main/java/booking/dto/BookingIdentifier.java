package booking.dto;

public class BookingIdentifier implements java.io.Serializable{
    private Long id;

    public BookingIdentifier() {}

    public BookingIdentifier(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
