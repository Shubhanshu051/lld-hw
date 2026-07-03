package CoffeeApplication;

import CoffeeApplication.BaseCoffee.*;

public class CoffeeFactory {
    public static Coffee getCoffee(int choice){
        switch(choice){
            case 1:
                return new Espresso();
            case 2:
                return new Americano();
            case 3:
                return new Cappuccino();
            case 4:
                return new Latte();
            default:
                return null;
        }
    }
}
