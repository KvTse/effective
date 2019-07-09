package cn.kvtse.study.designer.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Tsing Tse
 * @date 2019-07-09 23:11
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    /** 返回一个target的代理对象 */
    public Object getProxyInstance(){
        // 1.创建一个增强对象
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调方法
        enhancer.setCallback(this);
        // 4.返回代理子类对象
        return enhancer.create();
    }

    /**
     * 重写该方法,具体需要的代理业务逻辑
     * @param o
     * @param method 调用的方法
     * @param args 方法的参数
     * @param methodProxy
     * @return 方法执行的结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理开始......");
        Object resValue = method.invoke(target, args);
        System.out.println("cglib 代理结束......");
        return resValue;

    }
}
