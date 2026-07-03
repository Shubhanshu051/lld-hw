package CoffeeApplication;

import CoffeeApplication.AddOns.ExtraChocolate;
import CoffeeApplication.AddOns.ExtraCream;
import CoffeeApplication.AddOns.ExtraMilk;
import CoffeeApplication.AddOns.ExtraSugar;
import CoffeeApplication.BaseCoffee.Coffee;

import java.util.Scanner;

public class CoffeeApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COFFEE VENDING MACHINE =====");

        System.out.println("1. Espresso (120)");
        System.out.println("2. Americano (150)");
        System.out.println("3. Cappuccino (170)");
        System.out.println("4. Latte (200)");

        System.out.print("Choose Coffee : ");

        int choice = sc.nextInt();

        Coffee coffee = CoffeeFactory.getCoffee(choice);

        if (coffee == null) {
            System.out.println("Invalid Choice");
            return;
        }

        while (true) {

            System.out.println("\nChoose Add-ons");
            System.out.println("1. Extra Sugar (+10)");
            System.out.println("2. Extra Milk (+20)");
            System.out.println("3. Extra Cream (+30)");
            System.out.println("4. Extra Chocolate  (+40)");
            System.out.println("0. Finish");

            int addon = sc.nextInt();

            switch (addon) {

                case 1:
                    coffee = new ExtraSugar(coffee);
                    break;

                case 2:
                    coffee = new ExtraMilk(coffee);
                    break;

                case 3:
                    coffee = new ExtraCream(coffee);
                    break;

                case 4:
                    coffee = new ExtraChocolate(coffee);
                    break;

                case 0:
                    System.out.println("\n====== ORDER SUMMARY ======");
                    System.out.println("Coffee : " + coffee.getDescription());
                    System.out.println("Total  : ₹" + coffee.getCost());
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
