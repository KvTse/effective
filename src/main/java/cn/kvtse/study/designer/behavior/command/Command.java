package cn.kvtse.study.designer.behavior.command;

/**
 * 命令接口,具有execute和undo方法
 * @author Tsing Tse
 * @date 2019年7月30日23:44:59
 */
public interface Command {
    /** 命令执行方法 */
    void execute();
    /** 命令撤销方法 */
    void undo();
}
