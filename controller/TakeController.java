package machine.controller;

import machine.model.MyCoffeeMachine;

public class TakeController {

    public static void run() {
        MyCoffeeMachine coffeeMachine = MyCoffeeMachine.getInstance();
        System.out.printf("I gave you $%d\n", coffeeMachine.getMoney());
        coffeeMachine.setMoney(0);
    }
}
