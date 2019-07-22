package cn.kvtse.study.designer.behavior.observer;

/**
 * @author Tsing Tse
 * @date 2019-07-15 23:45
 */
public class Client {
    public static void main(String[] args) {
        Observer weatherCondition = new WeatherCondition();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(weatherCondition);


        weatherData.setData(10f,123f,60f);
        weatherData.notifyObservers();
    }
}
