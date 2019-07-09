package cn.kvtse.study.designer.structure.decorator;

/**
 * 圆增强
 *
 * @author Tsing Tse
 * @date 2019-07-07 9:25
 */
public class CircleDecorator extends ShapeDecorator{

    public CircleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public Shape draw() {
        shape.draw();
        setBoundary();
        return shape;
    }
    private void setBoundary(){
        System.out.println("给"+shape.getClass()+" 设置边界...");
    }
}
