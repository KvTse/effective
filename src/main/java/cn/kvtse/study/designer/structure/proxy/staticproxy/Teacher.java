package cn.kvtse.study.designer.structure.proxy.staticproxy;

/**
 * @author Tsing Tse
 * @date 2019-07-08 13:26
 */
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("...老师授课....");
    }
}
