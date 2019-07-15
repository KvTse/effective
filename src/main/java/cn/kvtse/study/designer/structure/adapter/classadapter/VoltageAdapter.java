package cn.kvtse.study.designer.structure.adapter.classadapter;

/**
 * @author Tsing Tse
 * @date 2019-07-10 7:39
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        return output220v()/44;
    }
}
