package cn.kvtse.study.designer.behavior.command;

/**
 * 电灯命令接收者
 * 相当于生活中的电灯,有开灯关灯的操作
 * @author Tsing Tse
 * @date 2019-07-30 23:49
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开啦...");
    }

    public void off(){
        System.out.println("电灯关闭啦...");
    }
}
