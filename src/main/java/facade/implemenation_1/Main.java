package facade.implemenation_1;

import facade.implemenation_1.reports.ReportType;

public class Main {
    public static void main(String[] args) {
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.createReport("C:/folder/folder1", ReportType.DAILY);
    }
}
