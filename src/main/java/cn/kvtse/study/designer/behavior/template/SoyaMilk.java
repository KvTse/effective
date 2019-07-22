package cn.kvtse.study.designer.behavior.template;

/**
 * @author Tsing Tse
 * @date 2019-07-16 9:54
 */
public abstract class SoyaMilk {
    /**
     * 模板方法...
     * 定义了算法的流程
     * 模板方法不希望子类重写它
     */
    protected final void make(){
        chooseBeans();
        addCondiments();
        soak();
        beat();
    }
    void chooseBeans(){
        System.out.println("选择大豆...");
    }
    /** 添加不同的辅料,产出不同的产品 */
    abstract void addCondiments();
    void soak(){
        System.out.println("浸泡3小时...");
    }
    void beat(){
        System.out.println("产出豆浆...");
    }
}
