package booking.eto;

public class UnavailableException extends Exception implements java.io.Serializable{

    public UnavailableException(String message) {
        super(message);
    }
}
