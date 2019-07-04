package cn.kvtse.study.jdk.jvm.clazz;

import cn.kvtse.study.jdk.MyHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tsing Tse
 * @date 2019年6月21日23:19:07
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获取ClassLoader的几种途径
        Class<ClassLoaderTest> clazz = ClassLoaderTest.class;
        ClassLoader clazzLoader = clazz.getClassLoader();
        System.out.println(clazzLoader);

        // 当前线程的上下文加载器
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);
        // 获得系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        MyHashMap[] myHashMaps = new MyHashMap[10];
        ClassLoader arraysClassLoader = myHashMaps.getClass().getClassLoader();
        System.out.println(arraysClassLoader);

    }
}
