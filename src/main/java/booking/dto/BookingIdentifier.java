package booking.dto;

public class BookingIdentifier {
    private final Long id;

    public BookingIdentifier() {}

    public BookingIdentifier(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
