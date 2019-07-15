package cn.kvtse.study.designer.structure.bridge;

/**
 * @author Tsing Tse
 * @date 2019-07-14 15:42
 */
public class FoldedPhone extends AbstractPhoneStyle {
    FoldedPhone(Brand brand) {
        super(brand);
    }
    @Override
    void open() {
        brand.open();
        System.out.println("折叠手机开机");
    }
    @Override
    void call() {
        brand.call();
        System.out.println("折叠手机打电话");
    }
    @Override
    void close() {
        brand.close();
        System.out.println("折叠手机关机");
    }
}
