package cn.kvtse.study.designer.behavior.observer;

/**
 * 被观察方的顶层接口
 * @author Tsing Tse
 */
public interface Subject {
    /** 注册观察者方法 */
    void registerObserver(Observer observer);
    /** 移除观察者方法 */
    void removeObserver(Observer observer);
    /** 通知所有观察者进行操作 */
    void notifyObservers();
}
