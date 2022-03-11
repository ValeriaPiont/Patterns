package builder.implementation_1;

import builder.implementation_1.ingredients.Condiment;
import builder.implementation_1.ingredients.Meat;
import builder.implementation_1.ingredients.Oil;
import builder.implementation_1.ingredients.Vegetables;


public class Main {
    public static void main(String[] args) {
        Soup soup = new Soup.SoupBuilder()
                .meat(Meat.PORK)
                .vegetables(Vegetables.POTATO, Vegetables.TOMATO, Vegetables.CABBAGE, Vegetables.CARROT)
                .build();
        System.out.println(soup);

        Salad salad = new Salad.SaladBuilder()
                .oil(Oil.OLIVE)
                .vegetables(Vegetables.TOMATO, Vegetables.POTATO)
                .condiment(Condiment.BASIL)
                .build();
        System.out.println(salad);
    }
}
