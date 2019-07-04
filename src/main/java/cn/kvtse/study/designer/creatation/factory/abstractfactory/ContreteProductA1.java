package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * ProductA的具体产品1
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:45
 */
public class ContreteProductA1 extends ProductA {
    @Override
    void independence(ProductB b) {
        System.out.println("A1 依赖于B1");
    }
}
