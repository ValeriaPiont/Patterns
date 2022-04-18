package singleton.thread_safe;

public class Main {
    public static void main(String[] args) {
        Thread firstSingletonThread = new Thread(new FirstSingletonThread());
        Thread secondSingletonThread = new Thread(new SecondSingletonThread());

        firstSingletonThread.start();
        secondSingletonThread.start();
    }

    static class FirstSingletonThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton1 = Singleton.getInstance("Text1");
            System.out.println(singleton1.getValue());
        }
    }
    static class SecondSingletonThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton2 = Singleton.getInstance("Text2");
            System.out.println(singleton2.getValue());
        }
    }

}
