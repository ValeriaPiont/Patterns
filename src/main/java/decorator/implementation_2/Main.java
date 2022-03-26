package decorator.implementation_2;

import decorator.implementation_2.cocktails.Mojito;
import decorator.implementation_2.standard_drinks.Rum;

public class Main {
    public static void main(String[] args) {
        Mojito mojito = new Mojito(new Rum(50));
        System.out.println(mojito.getAmount());
        System.out.println(mojito.getName());
    }
}
