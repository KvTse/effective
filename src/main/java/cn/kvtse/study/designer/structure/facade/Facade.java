package cn.kvtse.study.designer.structure.facade;

/**
 * 门面
 *
 * 门面模式主要是解决客户端和各个子系统之间的耦合的问题.
 * 它向外提供一个统一的接口,来隐藏系统的复杂性.
 *
 * 典型应用MVC三层架构
 * @author Tsing Tse
 * @date 2019-07-07 13:18
 */
public class Facade {
    public void facade(){
        SubSystem1 subSystem1 = new SubSystem1();
        subSystem1.operate();
        SubSystem2 subSystem2 = new SubSystem2();
        subSystem2.operate();
    }
}
