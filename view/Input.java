package machine.view;

import machine.enums.Action;
import machine.enums.CoffeeChoice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner SC = new Scanner(System.in);

    public static int getInt() {
        String input = SC.nextLine();
        if (input.matches("\\d+"))
            return Integer.parseInt(input);
        else
            throw new InputMismatchException();
    }

    public static Action getAction() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        return Action.getAction(SC.nextLine());
    }

    public static CoffeeChoice getCoffeeChoice() {
        return CoffeeChoice.getCoffee(SC.nextLine());
    }
}
