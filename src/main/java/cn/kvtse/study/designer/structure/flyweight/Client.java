package cn.kvtse.study.designer.structure.flyweight;

/**
 *
 * 1.享元模式,享指的是共享,元指的是对象
 * 2.系统中存在大量的对象,而且这些对象的大部分的状态可以外部化时,使用享元模式
 * 3.唯一标识判断,如果内存中存在就直接返回.常用HashMap等.常见如:数据库连接池
 * 4.大大减少了对象的创建,降低内存占用
 * 5.提升了系统的复杂度,需要分离出对象的内部状态和外部状态,而外部对象具有固化特型
 *      不随内部状态的变化而变化.
 * 6.使用享元模式时,注意划分内外部状态,并使用工厂类加以控制
 * 7.经典应用场景,数据库连接池,String常量池.
 *
 * @author Tsing Tse
 * @date 2019-07-12 13:07
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        AbstractWebsite newsWebsite = webSiteFactory.getWebsiteFromPool("新闻");
        newsWebsite.use(new User("jack"));

        AbstractWebsite blogWebsite = webSiteFactory.getWebsiteFromPool("博客");
        blogWebsite.use(new User("tom"));

        AbstractWebsite blogWebsite2 = webSiteFactory.getWebsiteFromPool("博客");
        blogWebsite2.use(new User("jerry"));
        System.out.println(webSiteFactory.getPoolSize());

    }
}
