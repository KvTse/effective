package cn.kvtse.study.designer.creatation.factory.factorymethod;

/**
 * 工厂方法客户端
 *
 * 工厂方法的优点在于,后续想要扩展的时候,
 * 只需要添加具体的产品和具体的工厂即可.
 * 例如后续想要新增小米手机和小米手机工厂,
 * 那样也可以不修改之前代码的情况下扩展新功能.
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:15
 */
public class Client {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new HuaWeiFactory();
        Mobile huaWeiMobile = mobileFactory.createMobile();
        huaWeiMobile.call();

        mobileFactory = new IPhoneFactory();
        Mobile iPhoneMobile = mobileFactory.createMobile();
        iPhoneMobile.call();
    }
}
