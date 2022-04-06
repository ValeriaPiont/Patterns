package template_method.implementation_2.templates;

public class OracleConnection extends ConnectionTemplate {

    @Override
    public void insert() {
        System.out.println("Insert query for Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete query for Oracle");
    }

    @Override
    public void update() {
        System.out.println("Update query for Oracle");
    }

    @Override
    public void read() {
        System.out.println("Read query for Oracle");
    }
}
