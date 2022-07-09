package observer.subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeaderData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeaderData() {
        observers = new ArrayList<Observer>();
    }

    public void setMesurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        //푸시 방식(주제가 옵저버에게 상태를 알리는 방식)
//        for(Observer observer : observers){
//            observer.update(temperature, humidity, pressure);
//        }

        //풀 방식(옵저버가 주제로부터 상태를 끌어오는 방식)
        for(Observer observer : observers){
            observer.update();
        }

    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
