package cn.kvtse.study.designer.behavior.template;

/**
 * 模板方法的具体实现类
 *
 * @author Tsing Tse
 * @date 2019-07-16 9:59
 */
public class BlackSoyaBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("添加黑豆...");
    }
}
