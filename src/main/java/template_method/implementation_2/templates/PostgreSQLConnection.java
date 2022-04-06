package template_method.implementation_2.templates;

public class PostgreSQLConnection extends ConnectionTemplate {

    @Override
    public void insert() {
        System.out.println("Insert query for PostgreSQL");
    }

    @Override
    public void delete() {
        System.out.println("Delete query for PostgreSQL");
    }

    @Override
    public void update() {
        System.out.println("Update query for PostgreSQL");
    }

    @Override
    public void read() {
        System.out.println("Read query for PostgreSQL");
    }

}
