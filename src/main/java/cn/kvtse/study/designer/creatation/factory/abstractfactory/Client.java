package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * 抽象工厂模式的客户端程序
 *
 * 抽象工厂模式与工厂方法模式的最大不同:
 * 抽象工厂模式它是创建一个以上的相互有依赖关系的对象
 * 工厂方法模式它是创建单一的对象.
 *
 * @author Tsing Tse
 * @date 2019-07-05 0:12
 */
public class Client {
    ProductA a;
    ProductB b;
    public Client(AbstractFactory abstractFactory){
        a = abstractFactory.createProductA();
        b = abstractFactory.createProductB();
    }
}
