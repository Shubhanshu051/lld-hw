package CoffeeApplication.AddOns;

import CoffeeApplication.BaseCoffee.Coffee;
import CoffeeApplication.CoffeeDecorator.CoffeeDecorator;

public class ExtraMilk extends CoffeeDecorator {
    public ExtraMilk(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Extra Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20;
    }
}
