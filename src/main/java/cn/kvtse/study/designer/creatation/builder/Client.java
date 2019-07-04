package cn.kvtse.study.designer.creatation.builder;

/**
 * @author Tsing Tse
 * @date 2019-07-04 7:56
 *
 * 针对建造者模式,
 *
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        // 构建一个具体的产品类.
        ConreteBuilder conreteBuilder = new ConreteBuilder();
        director.build(conreteBuilder);
        System.out.println(conreteBuilder.getProduct());

        // 构建另一个具体的产品类
        ContreteBuilder2 contreteBuilder2 = new ContreteBuilder2();
        director.build(contreteBuilder2);
        System.out.println(contreteBuilder2.getProduct());
    }
}
