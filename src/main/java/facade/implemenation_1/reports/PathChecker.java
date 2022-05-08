package facade.implemenation_1.reports;

import java.util.Objects;

public class PathChecker {
    public boolean validPath(String path) {
        return Objects.nonNull(path);
    }
}
