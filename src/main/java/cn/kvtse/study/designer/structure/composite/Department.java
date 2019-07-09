package cn.kvtse.study.designer.structure.composite;

import java.util.List;

/**
 * @author Tsing Tse
 * @date 2019-07-08 1:14
 */
public class Department extends AbstractOrganization {
    public Department(String name, String detail) {
        super(name, detail);
    }

    @Override
    protected List<AbstractOrganization> show() {
        System.out.println("专业名称 "+getName()+"  "+getDetail());
        return null;
    }
}
