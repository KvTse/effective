package cn.kvtse.study.designer.structure.decorator;

/**
 * Shape的具体实现
 *
 * @author Tsing Tse
 * @date 2019-07-07 9:17
 */
public class Circle implements Shape {
    @Override
    public Shape draw() {
        System.out.println("画圆...");
        return new Circle();
    }
}
