package cn.kvtse.study.designer.structure.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Function;

/**
 * @author Tsing Tse
 * @date 2019-07-09 7:31
 */
public class ProxyFactory {
    private Object target;
    ProxyFactory(Object target){
        this.target = target;
    }

    /**
     * 获得代理对象
     * @return 代理对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args)->{
                    System.out.println("代理之前处理逻辑...");
                    Object invokeResult = method.invoke(target, args);
                    System.out.println("代理之后处理逻辑...");
                    return invokeResult;
                });
    }


    /**
     * 获得代理对象
     * @return 代理对象
     */
    public Object getProxyInstance(InvocationHandler handler) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),handler);
    }
}
