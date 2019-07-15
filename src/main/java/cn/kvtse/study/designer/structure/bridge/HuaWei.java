package cn.kvtse.study.designer.structure.bridge;

/**
 * @author Tsing Tse
 * @date 2019-07-14 15:50
 */
public class HuaWei extends Brand{
    @Override
    void open() {
        System.out.println("HuaWei开机");
    }

    @Override
    void call() {
        System.out.println("HuaWei打电话");
    }

    @Override
    void close() {
        System.out.println("HuaWei关机");
    }
}
