package cn.kvtse.study.designer.structure.adapter.classadapter;

/**
 * @author Tsing Tse
 * @date 2019-07-10 7:40
 */
public class Phone {
    public void Charge(Voltage5V voltage5V){
        int i = voltage5V.output5V();
        System.out.println(i+"v 符合标准,正在充电...");
    }
}
