package decorator.implementation_2.standard_drinks;

import lombok.Setter;

@Setter
public class Liquor implements Drink {
    private double amount;
    private String addedDrink;

    public Liquor(double amount) {
        this.amount = amount;
    }

    @Override
    public String getName() {
        return "Liquor";
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