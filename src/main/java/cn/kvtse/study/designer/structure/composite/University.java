package cn.kvtse.study.designer.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tsing Tse
 * @date 2019-07-08 0:56
 */
public class University extends AbstractOrganization {
    /** 在大学中管理的是学院信息 */
    List<AbstractOrganization> colleges = new ArrayList<>();
    public University(String name, String detail) {
        super(name, detail);
    }

    @Override
    protected boolean add(AbstractOrganization abstractOrganization) {
        return colleges.add(abstractOrganization);
    }

    @Override
    protected boolean remove(AbstractOrganization abstractOrganization) {
        return colleges.remove(abstractOrganization);
    }

    @Override
    protected List<AbstractOrganization> show() {
        System.out.println("---------"+getName()+"----------");
        for (AbstractOrganization college : colleges) {
            college.show();
        }
        return colleges;
    }
}
