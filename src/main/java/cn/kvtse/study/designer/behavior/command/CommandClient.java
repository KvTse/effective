package cn.kvtse.study.designer.behavior.command;

/**
 * 命令模式客户端
 *
 * @author Tsing Tse
 * @date 2019-07-31 0:32
 */
public class CommandClient {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undo();
    }
}
