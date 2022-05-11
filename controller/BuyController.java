package machine.controller;

import machine.model.Cappuccino;
import machine.model.Espresso;
import machine.model.Latte;
import machine.model.MyCoffeeMachine;
import machine.view.Input;

public class BuyController {

    public static void run() {
        MyCoffeeMachine coffeeMachine = MyCoffeeMachine.getInstance();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        switch (Input.getCoffeeChoice()) {
            case ESPRESSO: {
                coffeeMachine.setCoffee(new Espresso());
                coffeeMachine.buyCoffee();
                break;
            }
            case LATTE: {
                coffeeMachine.setCoffee(new Latte());
                coffeeMachine.buyCoffee();
                break;
            }
            case CAPPUCCINO: {
                coffeeMachine.setCoffee(new Cappuccino());
                coffeeMachine.buyCoffee();
                break;
            }
            case BACK: {
                break;
            }
        }
    }
}
