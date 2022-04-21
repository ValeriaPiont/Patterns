package proxy.implementation_1;

import java.util.Objects;

public class ProxyProject implements Project{
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(Objects.isNull(realProject)){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
