package CoffeeApplication.AddOns;

import CoffeeApplication.BaseCoffee.Coffee;
import CoffeeApplication.CoffeeDecorator.CoffeeDecorator;

public class ExtraSugar extends CoffeeDecorator {

    public ExtraSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " Extra Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+10;
    }
}
