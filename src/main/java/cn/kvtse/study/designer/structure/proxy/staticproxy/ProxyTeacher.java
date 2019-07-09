package cn.kvtse.study.designer.structure.proxy.staticproxy;

/**
 * @author Tsing Tse
 * @date 2019-07-08 13:26
 */
public class ProxyTeacher implements ITeacher {
    private ITeacher target;
    @Override
    public void teach() {
        System.out.println("...代理老师准备上课...");
        target.teach();
        System.out.println("...代理老师结束上课...");
    }
    ProxyTeacher(ITeacher target){
        this.target = target;
    }
}
