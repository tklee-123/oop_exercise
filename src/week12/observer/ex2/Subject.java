package week12.observer.ex2;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject() {
        observers = new LinkedList<>();
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        stateChanged();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    private void stateChanged() {
        notifyAllObservers();
    }
}
