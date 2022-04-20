package adapter.implementation_2;

public class CoffeeTouchscreenAdapter extends OldCoffeeMachine implements CoffeeMachineInterface {
    @Override
    public void chooseFirstSelection() {
        System.out.println("Touchscreen:");
        selectA();
    }

    @Override
    public void chooseSecondSelection() {
        System.out.println("Touchscreen:");
        selectB();
    }
}

