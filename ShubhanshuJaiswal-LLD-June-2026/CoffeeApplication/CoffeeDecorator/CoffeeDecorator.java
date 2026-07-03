package CoffeeApplication.CoffeeDecorator;

import CoffeeApplication.BaseCoffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
