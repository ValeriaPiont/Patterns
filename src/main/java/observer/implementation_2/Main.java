package observer.implementation_2;

public class Main {

    public static void main(String[] args) {
        JobSite site = new JobSite();
        site.addVacancy("Java vacancy");
        site.addVacancy("C++ vacancy");

        Observer observer1 = new Subscriber("User1");
        Observer observer2 = new Subscriber("User2");

        site.addObserver(observer1);
        site.addObserver(observer2);

        site.addVacancy("Ruby vacancy");

        site.removeVacancy("C++ vacancy");
    }

}
