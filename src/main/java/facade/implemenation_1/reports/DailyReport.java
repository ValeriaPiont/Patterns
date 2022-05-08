package facade.implemenation_1.reports;

public class DailyReport implements ReportGenerator {

    @Override
    public void generate(String path) {
        System.out.println("Generate annual report in directory " + path);
    }

}
