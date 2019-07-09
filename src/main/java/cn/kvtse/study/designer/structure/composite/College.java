package cn.kvtse.study.designer.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tsing Tse
 * @date 2019-07-08 1:01
 */
public class College extends AbstractOrganization {
    private List<AbstractOrganization> departments = new ArrayList<>();
    public College(String name, String detail) {
        super(name, detail);
    }

    @Override
    protected boolean add(AbstractOrganization abstractOrganization) {
        return departments.add(abstractOrganization);
    }

    @Override
    protected boolean remove(AbstractOrganization abstractOrganization) {
        return departments.remove(abstractOrganization);
    }

    @Override
    protected List<AbstractOrganization> show() {
        System.out.println("==============="+getName()+"=================");
        departments.forEach(AbstractOrganization::show);
        return departments;
    }
}
