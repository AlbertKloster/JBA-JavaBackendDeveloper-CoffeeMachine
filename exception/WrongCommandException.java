package machine.exception;

public class WrongCommandException extends RuntimeException {
    public WrongCommandException() {
        super("Wrong command");
    }
}
