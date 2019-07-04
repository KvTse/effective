package cn.kvtse.study.designer.creatation.factory.factorymethod;

/**
 * 华为工厂
 *
 * @author Tsing Tse
 * @date 2019-07-04 23:14
 */
public class HuaWeiFactory extends MobileFactory {
    @Override
    Mobile createMobile() {
        return new HuaWei();
    }
}
