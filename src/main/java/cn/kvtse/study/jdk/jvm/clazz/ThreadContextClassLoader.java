package cn.kvtse.study.jdk.jvm.clazz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 线程上下文加载器
 * @author Tsing Tse
 * @date 2019-07-03 21:52
 *
 * 每个类都会使用加载自己的类加载器来加载自己所依赖的其它类.
 *
 * 由于双亲委托模型的局限性:父ClassLoader加载的类无法访问子ClassLoader加载的类.
 * 而在一个SPI(Service Provider Interface)中,例如JDBC,有可能位于java核心包下的类
 * 需要访问jar包所引用的类的具体实现.
 * 而父ClassLoader可以使用当前线程Thread.currentThread().getContextClassLoader()
 * 所指定的classLoader所加载的类.这就改变了,父加载器加载的类不能访问子加载器加载的
 * 类的缺点.
 *
 * 默认的线程上下文加载器是系统类加载器.这是因为在Launcher中的getSystemClassLoader
 * 的时候,设置了当前线程的上下文加载器为系统类加载器.
 *
 */
public class ThreadContextClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 系统类加载器
        System.out.println(Thread.currentThread().getContextClassLoader());
        // Thread位于java核心包中,有根加载器加载
        System.out.println(Thread.class.getClassLoader());

        // 服务加载器
        ServiceLoader<Driver> drivers = ServiceLoader.load(Driver.class);

        Iterator<Driver> iterator = drivers.iterator();

        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println(driver.getClass()+"   "+driver.getClass().getClassLoader());
            System.out.println(Thread.currentThread().getContextClassLoader());
        }

        System.out.println(ServiceLoader.class.getClassLoader());

        System.out.println("==============================");
        // 加载类的同时初始化
        Class.forName("java.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");

    }
}
