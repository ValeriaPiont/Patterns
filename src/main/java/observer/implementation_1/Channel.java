package observer.implementation_1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> observers;

    private final String channelName;

    @Getter
    private String status;

    public Channel(String channelName) {
        this.channelName = channelName;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       observers.forEach(observer -> observer.update(status + " (" + channelName + ")"));
    }

    public void setStatus(String status) {
        if(status.isEmpty()) {
            System.out.println("Invalid status");
        } else {
            this.status = status;
            notifyObservers();
        }
    }

}
