package singleton.thread_safe;

public class Singleton {
    private static volatile Singleton instance;
    private String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton(value);
                }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
