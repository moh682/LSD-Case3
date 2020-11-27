package booking.eto;

public class PersistanceFailedException extends Exception implements java.io.Serializable{


    public PersistanceFailedException(String message) {
        super(message);
    }
}
