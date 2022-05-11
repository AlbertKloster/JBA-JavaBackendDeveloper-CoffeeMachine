package machine.controller;

import machine.model.MyCoffeeMachine;
import machine.view.Input;

public class MainController {
    public static void run() {
        loadCoffeeMachine();
        boolean exit = false;
        while (!exit) {
            switch (Input.getAction()) {
                case BUY: {
                    BuyController.run();
                    break;
                }
                case FILL: {
                    FillController.run();
                    break;
                }
                case TAKE: {
                    TakeController.run();
                    break;
                }
                case REMAINING: {
                    RemainingController.run();
                    break;
                }
                case EXIT: {
                    exit = true;
                    break;
                }
            }
        }

    }

    private static void loadCoffeeMachine() {
        MyCoffeeMachine coffeeMachine = MyCoffeeMachine.getInstance();
        coffeeMachine.setWater(400);
        coffeeMachine.setMilk(540);
        coffeeMachine.setCoffeeBeans(120);
        coffeeMachine.setCups(9);
        coffeeMachine.setMoney(550);
    }
}
