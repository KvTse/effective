package cn.kvtse.study.designer.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tsing Tse
 * @date 2019-07-12 12:59
 */
public class WebSiteFactory {
    Map<String,AbstractWebsite> pool = new HashMap<>(16);

    /**
     * 提供一个获取池中对象的方法
     *
     * @param type 类型
     * @return 网站类型
     */
    public AbstractWebsite getWebsiteFromPool(String type){
        AbstractWebsite website = pool.get(type);
        if (null == website){
            pool.put(type,new ConreteWebsite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取池的大小
     * @return 池的大小
     */
    public int getPoolSize(){
        return pool.size();
    }
}
