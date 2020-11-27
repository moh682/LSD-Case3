package booking.eto;

public class InvalidInputException extends Exception implements java.io.Serializable{

    public InvalidInputException(String message) {
        super(message);
    }

}
