package cn.kvtse.study.designer.structure.proxy.staticproxy;

/**
 *
 * 代理模式:
 *  为对象提供一个替身,以控制对这个对象的访问,也就可以给目标对象,增强功能(好像装饰者模式也有这样的作用?)
 *  代理对象:远程对象,创建开销大的对象或者需要安全控制的对象
 *  三种形式:静态代理,JDK动态代理,cglib代理
 *
 * @author Tsing Tse
 * @date 2019-07-08 12:46
 */
public class Client {
    public static void main(String[] args) {
        // 目标对象
        ITeacher teacher = new Teacher();
        // 将目标对象丢由代理对象
        ITeacher  proxyTeacher = new ProxyTeacher(teacher);
        // 调用代理对象的方法
        proxyTeacher.teach();
    }
}
