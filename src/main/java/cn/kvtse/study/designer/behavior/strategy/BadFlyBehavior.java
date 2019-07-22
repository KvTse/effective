package cn.kvtse.study.designer.behavior.strategy;

/**
 * 飞行技术一般策略
 *
 * @author Tsing Tse
 * @date 2019-07-22 23:43
 */
public class BadFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行技术一般");
    }
}
