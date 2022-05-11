package machine.exception;

public class WrongInputException extends RuntimeException {
    public WrongInputException() {
        super("Wrong input!");
    }
}
