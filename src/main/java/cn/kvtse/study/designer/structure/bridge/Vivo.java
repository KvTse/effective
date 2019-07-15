package cn.kvtse.study.designer.structure.bridge;

/**
 * 具体产品
 * @author Tsing Tse
 * @date 2019-07-14 15:31
 */
public class Vivo extends Brand{
    @Override
    void open() {
        System.out.println("vivo开机");
    }

    @Override
    void call() {
        System.out.println("vivo打电话");
    }

    @Override
    void close() {
        System.out.println("vivo关机");
    }
}
