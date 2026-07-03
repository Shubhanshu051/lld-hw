package CoffeeApplication.AddOns;

import CoffeeApplication.BaseCoffee.Coffee;
import CoffeeApplication.CoffeeDecorator.CoffeeDecorator;

public class ExtraCream extends CoffeeDecorator {
    public ExtraCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Extra Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30;
    }
}
