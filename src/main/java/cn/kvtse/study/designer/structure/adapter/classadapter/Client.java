package cn.kvtse.study.designer.structure.adapter.classadapter;

/**
 * @author Tsing Tse
 * @date 2019-07-10 7:42
 * 另外,SpringMVC的HandlerAdapter使用了适配器模式
 * 可以参考阅读,提升.
 */
public class Client {
    public static void main(String[] args) {
        new Phone().Charge(new VoltageAdapter());
    }
}
