package cn.kvtse.study.chapter2.generic;

import java.util.Comparator;
import java.util.List;

/**
 * @author Tsing Tse
 * @date 2019年5月12日23:24:52
 */
public class GenericClass<T> {
    public void sort(List<T> list, Comparator<? super T> c) {
        // DO NOTHING,JUST TEST GENERICS!
    }
}
