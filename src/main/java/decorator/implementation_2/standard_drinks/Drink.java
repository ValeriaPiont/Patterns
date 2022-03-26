package decorator.implementation_2.standard_drinks;

public interface Drink {
    double amount = 0.0;

    String getName();
    void add(String addedDrink);
    double getAmount();
    void setAmount(double amount);
}
