package cn.kvtse.study.jdk.jvm.clazz;

import java.io.*;

public class CustomClassLoader extends ClassLoader{
    private String classLoaderName;
    private String filePath = "D:\\";
    private String classExtentName = ".class";
    /**
     * 如果调用这个方法,将设置AppClassLoader为自定义加载器的父加载器.
     * 这时,类路径下的类就会由系统类加载器进行加载
     */
    public CustomClassLoader(String classLoaderName){
        this.classLoaderName = classLoaderName;
    }
    public CustomClassLoader(String classLoaderName,ClassLoader parent){
        super(parent);
        this.classLoaderName = classLoaderName;
    }
    /**
     * 父类仅仅对此方法抛出一个异常,
     * 子类需重写父类的findClass方法
     * @param className 类的二进制名称
     * @return Class对象
     */
    @Override
    public Class findClass(String className){
        System.out.println("执行自定义ClassLoader的findClass方法~~");
        byte[] bytes = loadClassData(className);
        // 这里需要的是二进制的类名
        /**
         * "java.lang.String"
         * "javax.swing.JSpinner$DefaultEditor" 内部类
         * "java.security.KeyStore$Builder$FileBuilder$1" 内部类中第一个匿名内部类
         *  java.net.URLClassLoader$3$1" 第三个匿名内部类的第一个内部类
         */
        return defineClass(className, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String className) {
        InputStream inputStream = null;
        byte[] bytes = null;
        ByteArrayOutputStream baos = null;
        try {

            String name = className.replace(".","\\");
            inputStream = new FileInputStream(new File(filePath+name+this.classExtentName));
            baos = new ByteArrayOutputStream();
            int ch ;
            while((ch = inputStream.read())!=-1){
                baos.write(ch);
            }
            bytes = baos.toByteArray();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null){
                    inputStream.close();
                }
                if (baos!=null){
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes;
    }

    public static void main(String[] args) throws Exception {
        //这个方法简单的测试缩写的自定义类加载器
//        testClassLoader();
        //这种情况下,我们发现,相同自定义类加载器,加载出来的class对象为两不同的实例
        //这与我们所说的如果某个类被加载了就不会在次加载了,不相符.为什么呢?
        //因为,我们构建出来的两个类加载器,这两个类加载器这时存在两个类加载器的命名空间
        //我们所说的某个类被加载了就不会再次加载指的是在各自的命名空间中,只加载一次.
        testTwoSameClassLoadersLoadClass();

    }

    /**
     * 测试两个相同类但是不同实例,加载相同类的情况.
     */
    public static void testTwoSameClassLoadersLoadClass()throws Exception{
        CustomClassLoader customClassLoader = new CustomClassLoader("myCustomClassLoader");
        // loadClass方法检查完父加载器之后,如果父类加载器没有加载类,会调用findClass方法.
        Class<?> clazz = customClassLoader.loadClass("cn.kvtse.study.jdk.MyHashMap");
        System.out.println(clazz.newInstance());
        CustomClassLoader customClassLoader2 = new CustomClassLoader("myCustomClassLoader");
        // loadClass方法检查完父加载器之后,如果父类加载器没有加载类,会调用findClass方法.
        Class<?> clazz2 = customClassLoader2.loadClass("cn.kvtse.study.jdk.jvm.clazz.bean.MyPerson");
        System.out.println(clazz2.newInstance());
    }

    /**
     * 测试自定义类加载器
     * @throws Exception
     */
    private static void testClassLoader() throws Exception{
        CustomClassLoader customClassLoader = new CustomClassLoader("myCustomClassLoader");
        // loadClass方法检查完父加载器之后,如果父类加载器没有加载类,会调用findClass方法.
        Class<?> clazz = customClassLoader.loadClass("cn.kvtse.study.jdk.MyHashMap");
        System.out.println(clazz.newInstance());
    }
}
