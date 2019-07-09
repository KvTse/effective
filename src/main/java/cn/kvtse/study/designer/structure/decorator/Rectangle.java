package cn.kvtse.study.designer.structure.decorator;

/**
 * Shape的具体实现,矩形
 *
 * @author Tsing Tse
 * @date 2019-07-07 9:18
 */
public class Rectangle implements Shape {
    @Override
    public Shape draw() {
        System.out.println("画矩形...");
        return new Rectangle();
    }
}
