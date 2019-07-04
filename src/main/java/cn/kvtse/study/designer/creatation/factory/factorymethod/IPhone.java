package cn.kvtse.study.designer.creatation.factory.factorymethod;

/**
 * 相当于具体的产品类
 * @author Tsing Tse
 * @date 2019-07-04 23:06
 */
public class IPhone extends Mobile {
    public IPhone(){
        System.out.println("创建苹果手机~~");
    }

    @Override
    public void call() {
        System.out.println("use IPhone to call somebody~~");
    }
}
