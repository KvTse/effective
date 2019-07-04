package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * 抽象工厂的抽象产品类A
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:43
 */
public abstract class ProductA {
    /**
     * 产品A和产品B存在着某些相互依赖的特征
     * @param b 抽象产品b
     */
    abstract void independence(ProductB b);
}
