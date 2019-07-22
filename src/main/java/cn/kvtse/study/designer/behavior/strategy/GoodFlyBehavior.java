package cn.kvtse.study.designer.behavior.strategy;

/**
 * 擅长飞翔
 *
 * @author Tsing Tse
 * @date 2019-07-22 23:42
 */
public class GoodFlyBehavior implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("擅长飞翔...");
    }
}
