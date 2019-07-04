package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * ProductB的具体产品1
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:45
 */
public class ContreteProductB1 extends ProductB {
    @Override
    void independence(ProductA a) {
        System.out.println("b1 依赖于a1");
    }
}
