package facade.implemenation_1.reports;

import facade.implemenation_1.reports.ReportType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Report {

    private String name;
    private double size;
    private ReportType reportType;

}
