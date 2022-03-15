package factory_method.factory;

import factory_method.sheets.FormatTypes;
import factory_method.sheets.Sheet;

public abstract class PrinterCreator {

    public abstract Sheet createSheet(FormatTypes formatTypes);
}
