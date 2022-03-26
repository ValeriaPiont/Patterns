package decorator.implementation_2.standard_drinks;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Setter
public class Rum implements Drink {
    private double amount;
    private String addedDrink;

    public Rum(double amount) {
        this.amount = amount;
    }

    @Override
    public String getName() {
        return "Rum";
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
