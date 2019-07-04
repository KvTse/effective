package cn.kvtse.study.designer.creatation.builder;

/**
 *
 * 将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
 * @author Tsing Tse
 * @date 2019-07-04 6:58
 */
public interface Builder {

    /** 创建复杂产品的步骤 */
    void buildProductPartA();
    void buildProductPartB();

    /** 提供返回的产品的方法 */
    Product getProduct();
}
