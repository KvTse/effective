package cn.kvtse.study.designer.creatation.factory.factorymethod;

/**
 * IPhone工厂
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:15
 */
public class IPhoneFactory extends MobileFactory {
    @Override
    Mobile createMobile() {
        return new IPhone();
    }
}
