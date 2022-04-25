package observer.implementation_2;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
