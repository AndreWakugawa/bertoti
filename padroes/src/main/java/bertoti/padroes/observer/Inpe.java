package bertoti.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class Inpe {
    private List<Observer> observers = new ArrayList<>();
    private float temp;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }
}
