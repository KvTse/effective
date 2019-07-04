package cn.kvtse.study.jdk.jvm.clazz;

import java.lang.reflect.Method;

/**
 * ClassLoader 详解
 * @author Tsing Tse
 * 命名空间:
 *  每个类加载器都有自己的命名空间,命名空间是由类加载器加载的类和它所有的父加载器加载的类组成
 *  1.子加载器所加载的类能够访问父加载类所加载的类
 *  2.父加载器所有加载的类不能访问子加载类所加载的类
 *
 * 类加载器双亲委托模型的好处.
 *  1.可以确保java核心库的类型安全:所有的java的应用至少会引用Object类,
 *      也就是说在运行期Object类会被加载到虚拟机中,如果这个加载过程是由java应用自己的类加载完成的,
 *      那么很可能会在java中存在多个版本的Object类,而这些类可能是不兼容的(命名空间导致)
 *  2.可以确保java核心类库所提供的不会被自定义的类所替代.
 *  3.不同的类加载器可以为相同的名称的类创建额外的命名空间.
 *
 * 对于扩展类加载器,它是比较特殊的,当你在扩展类加载器的目录下,加入class文件的时候
 * 它是不会去加载类的,而是会从指定的扩展类加载目录下,扫描jar包,然后从jar包中取加载类.
 *
 *  * 关于不同类加载器加载同一个文件时.出现cn.kvtse.study.jdk.jvm.clazz.bean.MyPerson cannot be cast to cn.kvtse.study.jdk.jvm.clazz.bean.MyPerson解释
 *  *
 *  * 在运行期,一个java类是由该类的完全限定名(binary name)和
 *  * 用于加载该类的定义类加载器(defining classLoader)所共同决定的
 *  * 如果同样的名字类是由不同的加载器所加载的,那么它们是不同的类,
 *  * 而且相互之间是不可见的.
 */
public class ClassLoaderDetail {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new CustomClassLoader("MyClassLoader");
        ClassLoader classLoader2 = new CustomClassLoader("MyClassLoader2");
        // 这两个加载器,在jvm的内存中形成了两个内存空间,clazz和clazz2不存在任何双亲的关系
        Class<?> clazz = classLoader.loadClass("cn.kvtse.study.jdk.jvm.clazz.bean.MyPerson");
        Class<?> clazz2 = classLoader2.loadClass("cn.kvtse.study.jdk.jvm.clazz.bean.MyPerson");
        System.out.println(clazz==clazz2);
        System.out.println(clazz.getClassLoader());
        Object o = clazz.newInstance();
        Object o2 = clazz2.newInstance();
        Method setMyPerson = clazz.getMethod("setMyPerson", Object.class);
        Object invoke = setMyPerson.invoke(o, o2);
    }
}
