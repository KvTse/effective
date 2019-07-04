package cn.kvtse.study.chapter2.serviceprovider;

/**
 * 对外提供服务的接口
 * @author Tsing Tse
 * @date 2019年5月12日23:52:09
 */
public interface Provider {
    /**
     * 暴露给外部的方法 具体的情况共子类去实现
     * @return 对外提供的服务
     */
    Service newService();
}
