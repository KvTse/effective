package cn.kvtse.study.designer.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 相当于数据中心
 * @author Tsing Tse
 * @date 2019-07-15 23:51
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humility;

    void setData(float temperature,float pressure,float humility){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humility = humility;
    }

    private List<Observer> observers = new ArrayList<>();

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
        observers.forEach(observer -> observer.update(temperature,pressure,humility));
    }
}
