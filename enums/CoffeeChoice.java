package machine.enums;

import machine.exception.WrongInputException;

public enum CoffeeChoice {
    ESPRESSO, LATTE, CAPPUCCINO, BACK;

    public static CoffeeChoice getCoffee(String input) {
        switch (input.trim()) {
            case "1": return ESPRESSO;
            case "2": return LATTE;
            case "3": return CAPPUCCINO;
            case "back": return BACK;
        }
        throw new WrongInputException();
    }
}
