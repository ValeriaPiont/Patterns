package factory_method.factory;

import factory_method.sheets.FormatTypes;
import factory_method.sheets.Sheet;
import factory_method.sheets.A1;
import factory_method.sheets.A2;
import factory_method.sheets.A3;
import factory_method.sheets.A4;
import factory_method.sheets.A5;

public class PrinterFactory extends PrinterCreator{

    @Override
    public Sheet createSheet(FormatTypes formatTypes) {
       switch ((FormatTypes) formatTypes){
           case A1 -> {
               return new A1();
           }
           case A2 -> {
               return new A2();
           }
           case A3 -> {
               return new A3();
           }
           case A4 -> {
               return new A4();
           }
           case A5 -> {
               return new A5();
           }
       }
       throw new RuntimeException("Unknown sheet type");
    }
}
