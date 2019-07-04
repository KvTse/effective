package cn.kvtse.study.chapter2;

import cn.kvtse.study.chapter2.builder.NutritionFacts;

/**
 * @author Tsing Tse
 * @date 2019年5月14日00:45:27
 */
public class Builder {
    public static void main(String[] args) {
        /*
         * 遇到多个构造器的时候要考虑用构建器,也就是Builder模式
         * 这样做可以避免setter方式将对象向的构建与赋值分离开来
         * 也能避免使用构造函数创建对象时,导致客户端编码困难.
         * 详情参见builder报下代码.这种模式针对于优雅的创建对象,
         * 但是不支持对生成的对象的值的修改.
         */
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(12,10)
                .calories(13).fat(14).sodium(15).build();
        System.out.println(nutritionFacts.toString());
    }
}
