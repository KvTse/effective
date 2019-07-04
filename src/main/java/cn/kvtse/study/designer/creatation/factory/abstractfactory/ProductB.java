package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * 抽象工厂的抽象产品类B
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:43
 */
public abstract class ProductB {
    /**
     * 产品A和产品B存在着某些相互依赖的特征
     * @param a 抽象产品a
     */
    abstract void independence(ProductA a);
}
