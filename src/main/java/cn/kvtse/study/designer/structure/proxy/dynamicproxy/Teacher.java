package cn.kvtse.study.designer.structure.proxy.dynamicproxy;

/**
 * @author Tsing Tse
 * @date 2019-07-09 7:30
 */
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("授课中...");
    }
}
