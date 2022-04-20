package adapter.implementation_2;

public class Main {
    public static void main(String[] args) {
        CoffeeMachineInterface coffeeMachine = new CoffeeTouchscreenAdapter();
        coffeeMachine.chooseFirstSelection();
        coffeeMachine.chooseSecondSelection();
    }
}
