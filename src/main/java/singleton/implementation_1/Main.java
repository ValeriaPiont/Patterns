package singleton.implementation_1;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Text1");
        Singleton singleton2 = Singleton.getInstance("Text2");

        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }

}
