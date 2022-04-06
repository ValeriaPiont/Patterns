package template_method.implementation_2.templates;

public abstract class ConnectionTemplate {

    public boolean setConnectionInfo(String driver, String username, String password, String dialect){
        return setDriver(driver) &&
                setUser(username) &&
                    setPassword(password) &&
                        setDialect(dialect);
    }

    boolean setDriver(String driver) {
        //some business logic
        return !driver.isEmpty();
    }

    boolean setUser(String username) {
        //some business logic
        return !username.isEmpty();
    }

    boolean setPassword(String password) {
        //some business logic
        return !password.isEmpty();
    }

    boolean setDialect(String dialect) {
        //some business logic
        return !dialect.isEmpty();
    }

    public void connect() {
        System.out.println("Try to connect");
    }

    public void close() {
        System.out.println("Try to close connection");
    }

    public abstract void insert();
    public abstract void delete();
    public abstract void update();
    public abstract void read();

}
