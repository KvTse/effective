package cn.kvtse.study.designer.behavior.observer;

/**
 * @author Tsing Tse
 * @date 2019-07-15 23:58
 */
public class WeatherCondition implements Observer {
    @Override
    public void update(float temperature, float pressure, float humility) {
        System.out.println("WeatherCondition感知到天气发生变化....");
        System.out.println("天气发生变化了.......temperature is "+temperature+",pressure is "+pressure+" humility is "+humility);
    }
}
