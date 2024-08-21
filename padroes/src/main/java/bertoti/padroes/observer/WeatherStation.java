package bertoti.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<ObserverPattern> observers = new ArrayList<>();
    private float temp;

    public void addObserver(ObserverPattern observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverPattern observer) {
        observers.remove(observer);
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ObserverPattern observer : observers) {
            observer.update(temp);
        }
    }
}
