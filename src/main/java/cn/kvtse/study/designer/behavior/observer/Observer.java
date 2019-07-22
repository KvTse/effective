package cn.kvtse.study.designer.behavior.observer;

public interface Observer {
    /** 数据更新方法 */
    void update(float temperature,float pressure,float humility);
}
