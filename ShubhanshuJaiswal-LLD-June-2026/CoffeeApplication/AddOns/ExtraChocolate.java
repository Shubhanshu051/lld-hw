package CoffeeApplication.AddOns;

import CoffeeApplication.BaseCoffee.Coffee;
import CoffeeApplication.CoffeeDecorator.CoffeeDecorator;

public class ExtraChocolate extends CoffeeDecorator {
    public ExtraChocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " Extra Chocolate";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 40;
    }
}
