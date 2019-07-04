package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * 具体工厂1
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:50
 */
public class ContreteFactory1 extends AbstractFactory {
    @Override
    ProductA createProductA() {
        return new ContreteProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ContreteProductB1();
    }
}
