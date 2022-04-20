package adapter.implementation_1;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterOldToNewDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
