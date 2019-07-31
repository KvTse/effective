package cn.kvtse.study.designer.behavior.command;

/**
 * 电灯打开命令
 *
 * @author Tsing Tse
 * @date 2019-07-30 23:46
 */
public class LightOnCommand implements Command{
    /** 持有电灯命令接收者 */
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        // 开灯
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
