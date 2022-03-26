package decorator.implementation_2.cocktails;

import decorator.implementation_2.standard_drinks.Drink;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Mojito implements Drink {

    private Drink drink;
    private double mojitoAmount = 130;

    public Mojito(Drink drink) {
        this.drink = drink;
        this.drink.setAmount(drink.getAmount() + mojitoAmount);
        add(drink.getName());
    }

    @Override
    public String getName() {
        return "In Mojito was added (more)" + drink.getName();
    }

    @Override
    public void add(String addedDrink) {
        this.drink.add(addedDrink);
    }

    @Override
    public double getAmount() {
        return drink.getAmount();
    }

    @Override
    public void setAmount(double amount) {
        drink.setAmount(amount);
    }

}
