package cn.kvtse.study.designer.structure.facade;

/**
 * 门面模式客户端
 *
 * @author Tsing Tse
 * @date 2019-07-07 13:17
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facade();
    }
}
