package decorator.implementation_2.standard_drinks;

public class Cola implements Drink {
    private double amount;
    private String addedDrink;

    public Cola(double amount) {
        this.amount = amount;
    }

    @Override
    public String getName() {
        return "Cola";
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
