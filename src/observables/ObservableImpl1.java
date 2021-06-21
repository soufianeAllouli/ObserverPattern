package observables;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable {

    private int state;
    private List<Observer> observers=new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(this);
        });
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
