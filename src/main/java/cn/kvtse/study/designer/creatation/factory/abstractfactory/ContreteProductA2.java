package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * ProductA的具体产品2
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:45
 */
public class ContreteProductA2 extends ProductA {
    @Override
    void independence(ProductB b) {
        System.out.println("A2 依赖于B2");
    }
}
