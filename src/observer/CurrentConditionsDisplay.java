package observer;

import observer.subject.WeaderData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeaderData weaderData;

    public CurrentConditionsDisplay(WeaderData weaderData){
        this.weaderData = weaderData;
        weaderData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

    //푸시 방식
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

    //풀 방식
    @Override
    public void update() {
        this.temperature = weaderData.getTemperature();
        this.humidity = weaderData.getHumidity();

        display();
    }
}
