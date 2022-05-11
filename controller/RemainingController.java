package machine.controller;

import machine.model.MyCoffeeMachine;

public class RemainingController {
    public static void run() {
        MyCoffeeMachine coffeeMachine = MyCoffeeMachine.getInstance();
        coffeeMachine.printStatus();
    }
}
