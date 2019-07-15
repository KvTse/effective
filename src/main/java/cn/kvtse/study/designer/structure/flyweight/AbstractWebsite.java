package cn.kvtse.study.designer.structure.flyweight;

/**
 * 享元模式
 *  网站(产品)的抽象类
 * @author Tsing Tse
 * @date 2019-07-12 12:54
 */
public abstract class AbstractWebsite {
    /**
     * 使用网站的的抽象方法
     * @param user 用户信息
     */
    abstract void use(User user);
}
