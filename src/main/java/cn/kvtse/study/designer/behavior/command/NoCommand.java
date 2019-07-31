package cn.kvtse.study.designer.behavior.command;

/**
 * 空实现,调用空命令时,什么都不做.
 *
 * @author Tsing Tse
 * @date 2019-07-31 0:03
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
