package cn.kvtse.study.designer.behavior.strategy;

/**
 * 客户端
 *
 * @author Tsing Tse
 * @date 2019-07-23 0:06
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.setIFlyBehavior(new GoodFlyBehavior());
        wildDuck.fly();
    }
}
