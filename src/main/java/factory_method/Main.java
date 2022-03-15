package factory_method;

import factory_method.factory.PrinterCreator;
import factory_method.factory.PrinterFactory;
import factory_method.sheets.FormatTypes;

public class Main {
    public static void main(String[] args) {
        PrinterCreator printerCreator = new PrinterFactory();
        System.out.println(printerCreator.createSheet(FormatTypes.A3));
    }
}
