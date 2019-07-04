package cn.kvtse.study.jdk.eight;

import java.util.Arrays;
import java.util.List;

/**
 * lambda学习
 *
 * @author Tsing Tse
 * @date 2019-06-26 12:55
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.forEach(System.out::println);
        /*流式编程,将list中的每个元素转换成大写,后并打印*/
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
