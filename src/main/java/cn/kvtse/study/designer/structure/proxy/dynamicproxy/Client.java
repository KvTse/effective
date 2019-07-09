package cn.kvtse.study.designer.structure.proxy.dynamicproxy;

/**
 * @author Tsing Tse
 * @date 2019-07-09 7:29
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
