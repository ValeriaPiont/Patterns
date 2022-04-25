package observer.implementation_2;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
