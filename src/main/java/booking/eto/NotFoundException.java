package booking.eto;

public class NotFoundException extends Exception implements java.io.Serializable{

    public NotFoundException(String message) {
        super(message);
    }

}
