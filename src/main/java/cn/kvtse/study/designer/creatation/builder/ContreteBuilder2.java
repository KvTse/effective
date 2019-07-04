package cn.kvtse.study.designer.creatation.builder;

/**
 * 不同的builder
 *
 * @author Tsing Tse
 * @date 2019-07-04 7:53
 */
public class ContreteBuilder2 implements Builder {
    private Product product = new Product();
    @Override
    public void buildProductPartA() {
        product.setA("aa");
    }

    @Override
    public void buildProductPartB() {
        product.setB("bb");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
