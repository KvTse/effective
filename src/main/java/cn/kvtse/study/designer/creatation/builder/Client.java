package cn.kvtse.study.designer.creatation.builder;

/**
 * @author Tsing Tse
 * @date 2019-07-04 7:56
 *
 * 建造者模式的使用场景:
 *  1.相同的方法,不同的执行顺序,产生不同事件的结果时;
 *  2.多零件或部件,都可以装配到一个对象中,但产生的运行结果不同时;
 *  3.产品类非常复杂,或者产品类中的调用顺序不同产生了不同的效果;
 *  4.初始化一个对象特别复杂,如对象含有很多参数,且多为默认参数时.
 *      参见cn.kvtse.study.chapter2.Builder测试入口类.
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
