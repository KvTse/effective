package cn.kvtse.study.designer.behavior.template;

/**
 * 模板方法客户端
 *  模板方法主要用于一个具体的流程中.
 * @author Tsing Tse
 * @date 2019-07-16 9:53
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk blackSoyaBeanSoyaMilk = new BlackSoyaBeanSoyaMilk();
        blackSoyaBeanSoyaMilk.make();
    }
}
