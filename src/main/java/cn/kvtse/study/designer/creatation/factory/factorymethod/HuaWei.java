package cn.kvtse.study.designer.creatation.factory.factorymethod;

/**
 * 相当于具体的产品类
 * @author Tsing Tse
 * @date 2019-07-04 23:07
 */
public class HuaWei extends Mobile{
    public HuaWei(){
        System.out.println("创建华为手机");
    }

    @Override
    public void call() {
        System.out.println("use HuaWei to call somebody...");
    }
}
