package cn.kvtse.study.designer.structure.flyweight;

/**
 * 具体的网站类
 * @author Tsing Tse
 * @date 2019-07-12 12:56
 */
public class ConreteWebsite extends AbstractWebsite{
    /** 网站类型 共享部分,属于享元模式的内部状态*/
    private String type;
    public ConreteWebsite(String type){
        this.type = type;
    }
    @Override
    void use(User user) {
        System.out.println("以"+type+"形式发布网站,"+user.getName()+"正在使用......");
    }
}
