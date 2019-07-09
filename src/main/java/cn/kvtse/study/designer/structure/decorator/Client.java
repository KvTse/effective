package cn.kvtse.study.designer.structure.decorator;

/**
 * 装饰者
 *
 * 概述:
 *  1.装饰模式以对客户端透明的形式扩展对象的功能,是继承关系的一种替代方案.
 *  2.动态的给对象附加更多的责任.
 *  3.可以在不添加子类的情况下,对对象的功能加以扩展.
 *
 * @author Tsing Tse
 * @date 2019-07-07 8:21
 */
public class Client {

    public static void main(String[] args) {
        // 给圆动态添加设置边界的功能.
        ShapeDecorator shapeDecorator = new RectangleDecorator(new CircleDecorator(new Circle()));
        shapeDecorator.draw();
    }

}
