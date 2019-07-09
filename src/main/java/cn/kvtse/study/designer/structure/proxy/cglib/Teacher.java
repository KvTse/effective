package cn.kvtse.study.designer.structure.proxy.cglib;

/**
 * cglib代理,目标对象不需要实现接口
 * @author Tsing Tse
 * @date 2019-07-09 23:09
 */
public class Teacher {
    public void teach(){
        System.out.println("cglib代理,目标对象授课中");
    }
}
