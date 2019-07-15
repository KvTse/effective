package cn.kvtse.study.designer.structure.bridge;

/**
 * @author Tsing Tse
 * @date 2019-07-14 15:55
 */
public class StraightPhone extends AbstractPhoneStyle {
    StraightPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        brand.open();
        System.out.println("直立式手机开机");
    }

    @Override
    void call() {
        brand.call();
        System.out.println("直立式手机打电话");
    }

    @Override
    void close() {
        brand.close();
        System.out.println("直立式手机关机");
    }
}
