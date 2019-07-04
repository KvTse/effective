package cn.kvtse.study.designer.creatation.builder;

/**
 * 具体的构建者
 *
 * @author Tsing Tse
 * @date 2019-07-04 7:43
 */
public class ConreteBuilder implements Builder {
    /** 具体的构建者中持有产品对象 */
    Product product = new Product();
    @Override
    public void buildProductPartA() {
        product.setA("a");
    }

    @Override
    public void buildProductPartB() {
        product.setB("b");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
