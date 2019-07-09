package cn.kvtse.study.designer.structure.decorator;

/**
 * 矩形装饰器
 *
 * @author Tsing Tse
 * @date 2019-07-07 12:42
 */
public class RectangleDecorator extends ShapeDecorator {
    public RectangleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public Shape draw() {
        shape.draw();
        calculateArea();
        return shape;
    }
    private void calculateArea(){
        System.out.println("计算面积");
    }
}
