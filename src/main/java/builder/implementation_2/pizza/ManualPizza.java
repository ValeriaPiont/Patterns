package builder.implementation_2.pizza;


import builder.implementation_2.ingredients.*;

import java.util.List;

public class ManualPizza {

    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Vegetables> vegetables;

    public ManualPizza(Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Vegetables> vegetables) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meet=" + meat +
                ", vegetables=" + vegetables +
                '}';
    }
}
