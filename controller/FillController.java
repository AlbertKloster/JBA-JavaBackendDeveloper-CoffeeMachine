package machine.controller;

import machine.model.MyCoffeeMachine;
import machine.view.Input;

public class FillController {

    public static void run() {
        MyCoffeeMachine coffeeMachine = MyCoffeeMachine.getInstance();
        fillWater(coffeeMachine);
        fillMilk(coffeeMachine);
        fillCoffeeBeans(coffeeMachine);
        fillCups(coffeeMachine);
    }

    private static void fillWater(MyCoffeeMachine coffeeMachine) {
        System.out.println("Write how many ml of water you want to add: ");
        coffeeMachine.setWater(coffeeMachine.getWater() + Input.getInt());
    }

    private static void fillMilk(MyCoffeeMachine coffeeMachine) {
        System.out.println("Write how many ml of milk you want to add");
        coffeeMachine.setMilk(coffeeMachine.getMilk() + Input.getInt());
    }

    private static void fillCoffeeBeans(MyCoffeeMachine coffeeMachine) {
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() + Input.getInt());
    }

    private static void fillCups(MyCoffeeMachine coffeeMachine) {
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        coffeeMachine.setCups(coffeeMachine.getCups() + Input.getInt());
    }

}
