package cn.kvtse.study.designer.structure.proxy.cglib;

/**
 * @author Tsing Tse
 * @date 2019-07-09 23:08
 */
public class Client {
    public static void main(String[] args) {
        Teacher target = new Teacher();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        Teacher proxyInstance = (Teacher) proxyFactory.getProxyInstance();
        // cn.kvtse.study.designer.structure.proxy.cglib.Teacher$$EnhancerByCGLIB$$2f5b1a00
        System.out.println(proxyInstance.getClass().getName());
        System.out.println(proxyInstance.getClass().getClassLoader());
        proxyInstance.teach();
    }
}
