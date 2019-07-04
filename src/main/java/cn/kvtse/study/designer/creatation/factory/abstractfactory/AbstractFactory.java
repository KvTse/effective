package cn.kvtse.study.designer.creatation.factory.abstractfactory;

import cn.kvtse.study.designer.creatation.builder.Product;

/**
 * 抽象工厂
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:47
 */
public abstract class AbstractFactory {
    /** 创建A类产品 */
    abstract ProductA createProductA();
    /** 创建B类产品 */
    abstract ProductB createProductB();
}
