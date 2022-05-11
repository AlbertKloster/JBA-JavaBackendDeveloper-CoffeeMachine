package machine.model;

/**
 * Singleton class
 */
public class MyCoffeeMachine {

    private static MyCoffeeMachine instance;

    private Coffee coffee;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;

    private int money;

    private MyCoffeeMachine() { }

    public static MyCoffeeMachine getInstance() {
        if (instance == null)
            instance = new MyCoffeeMachine();
        return instance;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void printStatus() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n",
                water,
                milk,
                coffeeBeans,
                cups,
                money
        );
    }

    public void buyCoffee() {
        if (enoughWater() && enoughMilk() && enoughCoffeeBeans() && enoughCups()) {
            water -= coffee.getWater();
            milk -= coffee.getMilk();
            coffeeBeans -= coffee.getCoffeeBeans();
            cups--;
            money += coffee.getPrice();
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.printf("Sorry, not enough %s!", getDeficitResource());
        }
    }

    private String getDeficitResource() {
        if (notEnoughWater())
            return "water";
        if (notEnoughMilk())
            return "milk";
        if (notEnoughCoffeeBeans())
            return "coffee beans";
        if (notEnoughCups())
            return "cups";
        return "";
    }

    private boolean notEnoughWater() {
        return !enoughWater();
    }
    private boolean enoughWater() {
        return water >= coffee.getWater();
    }

    private boolean notEnoughMilk() {
        return !enoughMilk();
    }
    private boolean enoughMilk() {
        return milk >= coffee.getMilk();
    }

    private boolean notEnoughCoffeeBeans() {
        return !enoughCoffeeBeans();
    }
    private boolean enoughCoffeeBeans() {
        return coffeeBeans >= coffee.getCoffeeBeans();
    }

    private boolean notEnoughCups() {
        return !enoughCups();
    }
    private boolean enoughCups() {
        return cups >= 1;
    }

}
