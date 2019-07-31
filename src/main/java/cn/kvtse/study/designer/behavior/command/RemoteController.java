package cn.kvtse.study.designer.behavior.command;

/**
 * 遥控器
 * 它持有多组命令
 *
 * @author Tsing Tse
 * @date 2019-07-31 0:05
 */
public class RemoteController {
    /** 打开命令 */
    private Command[] onCommands;
    /** 关闭命令 */
    private Command[] offCommands;

    /** 记录上一次执行的命令 */
    private Command undo;

    /**
     * 构建对象时,初始化命令
     */
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        // 初始化命令
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置按钮
     * @param no 按钮号
     * @param onCommand 开命令
     * @param offCommand 关命令
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no){
        Command onCommand = onCommands[no];
        onCommand.execute();
        undo = offCommands[no];
    }

    public void offButtonWasPushed(int no){
        Command offCommand = offCommands[no];
        offCommand.execute();
        undo = onCommands[no];
    }

    public void undo(){
        undo.execute();
    }
}
