package cn.kvtse.study.designer.structure.decorator;

/**
 * 图形装饰器
 *
 * @author Tsing Tse
 * @date 2019-07-07 9:19
 */
public abstract class ShapeDecorator implements Shape{
    /** 持有一个Shape的引用 */
    Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
}
