package cn.kvtse.study.designer.behavior.command;

/**
 * 关灯命令
 *
 * @author Tsing Tse
 * @date 2019-07-30 23:53
 */
public class LightOffCommand implements Command {
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
