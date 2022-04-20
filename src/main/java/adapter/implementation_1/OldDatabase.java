package adapter.implementation_1;

public class OldDatabase implements Database{
    @Override
    public void insert() {
        System.out.println("Insert Entity");
    }

    @Override
    public void update() {
        System.out.println("Update Entity");
    }

    @Override
    public void select() {
        System.out.println("Select Entity");
    }

    @Override
    public void remove() {
        System.out.println("Remove Entity");
    }

}
