package cn.kvtse.study.designer.behavior.strategy;

/**
 * 具体的产品类
 *
 * @author Tsing Tse
 * @date 2019-07-22 23:41
 */
public class WildDuck extends AbstractDuck {
    public void setIFlyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    /**
     * 野鸭的飞翔方法,如果想要实现叫的方法
     * 添加叫的策略就行.
     */
    public void fly(){
        flyBehavior.fly();
    }
}
