package proxy.implementation_1;

public class Client {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.link.com");

        project.run();
    }
}
