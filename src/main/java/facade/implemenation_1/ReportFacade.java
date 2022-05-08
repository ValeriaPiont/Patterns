package facade.implemenation_1;

import facade.implemenation_1.reports.PathChecker;
import facade.implemenation_1.reports.*;

import java.nio.file.InvalidPathException;

public class ReportFacade {

    public void createReport(String path, ReportType type) {
        PathChecker pathChecker = new PathChecker();
        // and other business logic
        if(pathChecker.validPath(path)) {
            switch (type) {
                case MONTHLY -> new MonthlyReport().generate(path);
                case DAILY -> new DailyReport().generate(path);
                case ANNUAL -> new AnnualReport().generate(path);
            }
        } else {
            throw new InvalidPathException(path, "Path is null");
        }

    }

}
