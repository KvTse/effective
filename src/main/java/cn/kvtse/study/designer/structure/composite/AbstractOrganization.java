package cn.kvtse.study.designer.structure.composite;

import java.util.List;

/**
 * 组织抽象类
 *
 * @author Tsing Tse
 * @date 2019-07-08 0:43
 */
public abstract class AbstractOrganization {
    /**名称*/
    private String name;
    /**详情*/
    private String detail;
    /**
     * 添加组织,由于叶子节点不能再添加子节点,
     * 因此可在抽象类中给出默认的实现
     *
     * @param abstractOrganization 组织抽象类
     *
     */
    protected boolean add(AbstractOrganization abstractOrganization){
        throw new UnsupportedOperationException("the leaf can not add child organization!");
    }

    protected boolean remove(AbstractOrganization abstractOrganization){
        throw new UnsupportedOperationException("the leaf can not add child organization!");
    }
    /** 展示所有的内容
     * @return 组织详情
     */
    protected abstract List<AbstractOrganization> show();

    public AbstractOrganization(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
