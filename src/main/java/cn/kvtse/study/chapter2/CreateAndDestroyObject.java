package cn.kvtse.study.chapter2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 该类主要是对应学习Effective Java的第二章
 * 创建和销毁对象
 * @author Tsing Tse
 * @date 2019年5月12日23:02:04
 */
public class CreateAndDestroyObject {
    public static void main(String[] args) {
        // 1.考虑用静态工厂方法代替构造器
            /*
             1.静态方法相较于构造方法,它有具体的名称,可以准确的之后某个方法索要处理的具体业务逻辑
             2.不必在每次调用它的时候都创建新的实例.例如单例
             3.可以返回原返回类型的任何子类型的对象.(泛型的使用)
                这一点可以参见代码service provider包下代码
                 以下是在看集合Collections的时候不理解的地方,经查阅资料
                 当方法用<T>泛型修饰的时候,name这个方法可以放在任何类中,如果方法没被<T>修饰,则该类必须要用泛型修饰.
                 public static <T> void sort(List<T> list, Comparator<? super T> c) {list.sort(c);}
             4.在创建参数化类型实例的时候,它们使代码变得简单
             */
    }
}
