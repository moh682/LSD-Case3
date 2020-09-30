package booking.entity;

public class Hotel extends Place {

    private long id;


    private enum Rating {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE
    }

    ;
    private Rating rating;


    public Hotel(String name, Address address, boolean active, long id, Rating rating) {
        super(name, address, active);
        this.id = id;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
