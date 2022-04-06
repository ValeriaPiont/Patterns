package template_method.implementation_2;

import template_method.implementation_2.templates.ConnectionTemplate;
import template_method.implementation_2.templates.OracleConnection;
import template_method.implementation_2.templates.PostgreSQLConnection;

public class Main {
    public static void main(String[] args) {
        ConnectionTemplate templatePSQL = new PostgreSQLConnection();
        templatePSQL.setConnectionInfo("PSQLDriver", "PSQLUser", "1234", "PSQLDialect");
        templatePSQL.connect();
        templatePSQL.insert();
        templatePSQL.delete();
        templatePSQL.close();

        ConnectionTemplate templateOracle = new OracleConnection();
        templateOracle.setConnectionInfo("OracleDriver", "OracleUser", "5678", "OracleDialect");
        templateOracle.insert();
        templateOracle.update();
        templateOracle.close();
    }
}
