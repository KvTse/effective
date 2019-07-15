package cn.kvtse.study.designer.structure.flyweight;

/**
 * 每个网站的用户都是可能不同的
 * 但网站本身不受他的影响,因此它是外部状态
 * @author Tsing Tse
 * @date 2019-07-12 13:15
 */
public class User {
    private String name;
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
