package observer.weatherstation;

import observer.CurrentConditionsDisplay;
import observer.subject.WeaderData;

public class WeatherStation {

    public static void main(String[] args) {
        WeaderData weaderData = new WeaderData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weaderData);

        weaderData.setMesurements(80, 65, 30.4f);
        weaderData.setMesurements(82, 70, 29.2f);
        weaderData.setMesurements(78, 90, 29.2f);
    }
}
