package decorator.implementation_2.standard_drinks;

import lombok.AllArgsConstructor;
import lombok.Setter;


@Setter
public class Sprite implements Drink {
    private double amount;
    private String addedDrink;

    public Sprite(double amount) {
        this.amount = amount;
    }

    @Override
    public String getName() {
        return "Sprite";
    }

    @Override
    public void add(String addedDrink) {
        this.addedDrink = addedDrink;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
