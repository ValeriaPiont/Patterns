package builder.implementation_2;

import builder.implementation_2.builders.PizzaBuilder;
import builder.implementation_2.builders.PizzaManualBuilder;
import builder.implementation_2.ingredients.Cheese;
import builder.implementation_2.ingredients.Meat;
import builder.implementation_2.ingredients.Vegetables;
import builder.implementation_2.pizza.ManualPizza;
import builder.implementation_2.pizza.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaBuilder builder = new PizzaBuilder();
        Director director = new Director();

        director.constructSeaPizza(builder);
        Pizza seaPizza = builder.getResult();
        System.out.println("Your order is sea pizza: " + seaPizza);

        director.constructMeatPizza(builder);
        Pizza meatPizza = builder.getResult();
        System.out.println("Your order is meat pizza: " + meatPizza);

        ManualPizza meatCheesyHotPizza;
        PizzaManualBuilder manualBuilder = new PizzaManualBuilder();
        director.constructMeatPizza(manualBuilder);
        manualBuilder.addCheese(Cheese.PARMESAN, Cheese.SMETANKOVIY);
        manualBuilder.addVegetables(Vegetables.CHILI_PEPPER, Vegetables.JALAPENO);
        manualBuilder.addMeat(Meat.PROSHUTTO);
        meatCheesyHotPizza = manualBuilder.getResult();
        System.out.println("Your order: " + meatCheesyHotPizza);
    }
}
