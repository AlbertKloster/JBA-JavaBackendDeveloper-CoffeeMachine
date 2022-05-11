package machine.enums;

import machine.exception.WrongCommandException;

import java.util.Locale;

public enum Action {
    BUY, FILL, TAKE, REMAINING, EXIT;

    public static Action getAction(String input) {
        for (Action c : Action.values()) {
            if (c.name().equals(input.toUpperCase(Locale.ROOT)))
                return c;
        }
        throw new WrongCommandException();
    }
}
