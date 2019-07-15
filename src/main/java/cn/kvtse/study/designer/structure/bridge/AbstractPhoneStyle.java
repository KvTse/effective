package cn.kvtse.study.designer.structure.bridge;

/**
 *
 * @author Tsing Tse
 */
public abstract class AbstractPhoneStyle {
    protected Brand brand;
    AbstractPhoneStyle(Brand brand){
        this.brand = brand;
    }
    abstract void open();
    abstract void call();
    abstract void close();
}
