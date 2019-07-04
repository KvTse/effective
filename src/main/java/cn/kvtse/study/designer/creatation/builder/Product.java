package cn.kvtse.study.designer.creatation.builder;

/**
 * 建造者模式下的产品类
 *
 * @author Tsing Tse
 * @date 2019-07-04 7:31
 */
public class Product {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Product{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
