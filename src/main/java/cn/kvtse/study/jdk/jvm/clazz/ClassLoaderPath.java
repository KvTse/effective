package cn.kvtse.study.jdk.jvm.clazz;

import sun.misc.Launcher;

/**
 * @author Tsing Tse
 * @date 2019-06-29 8:53
 *
 * 内建于JVM的启动类加载器会加载ClassLoader以及其它java平台类.
 * 也就是说扩展类加载器,系统类加载器都是由bootstrap所加载的.
 * 启动类加载器不是java类,而其它的加载器是java类.它负责开启整个加载过程
 */
public class ClassLoaderPath {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        // null 说明ClassLoader是由启动类加载器加载.
        System.out.println(ClassLoader.class.getClassLoader());
        // Launcher由启动类加载器加载,扩展类加载器和系统类加载器是Launch的内部类.
        System.out.println(Launcher.class.getClassLoader());
        ClassLoader.getSystemClassLoader();
    }
}
