package cn.kvtse.study.chapter2.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 这相当于一个工具类,用以提供各种不同的服务
 * @author Tsing Tse
 * @date 2019年5月12日23:55:18
 */
public class Services {
    private Services(){}
    /** 容器,用来存放各种provider */
    private static final Map<String,Provider> providers = new ConcurrentHashMap<String, Provider>();
    private static final String DEFAULT_PROVIDER_NAME = "defProvider";
    /** 注册默认的服务提供者 */
    public static void registerDefaultProvider(Provider provider){
        providers.put(DEFAULT_PROVIDER_NAME,provider);
    }
    /** 注册普通的服务 */
    public static void registerProvider(String name,Provider provider){
        providers.put(name,provider);
    }

    /**
     * 获取对外服务
     * @param name 服务名称
     * @return 服务提供者
     */
    public static Service newInstance(String name){
        Provider provider = providers.get(name);
        if (provider == null){
            throw new IllegalArgumentException("No provider register with name " + name);
        }
        // 这里就体现了代码的灵活性,你可以动态的添加服务,注册服务来达到扩展程序的目标
        // 具体实现的时候只要,创建provider的子类即可,并实现newService方法即可.
        return provider.newService();
    }

    /**
     * 提供默认的服务者
     * @return
     */
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}
