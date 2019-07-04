package cn.kvtse.study.designer.creatation.builder;

/**
 * director提供一个builder方法创建
 * @author Tsing Tse
 * @date 2019-07-04 7:47
 */
public class Director {
    /** 传入不同的builder可以得到不同的产品 */
    void build(Builder builder){
        builder.buildProductPartA();
        builder.buildProductPartB();
    }
}
