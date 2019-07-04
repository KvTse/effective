package cn.kvtse.study.designer.creatation.factory.abstractfactory;

/**
 * main方法入口
 *
 * @author Tsing Tse
 * @date 2019-07-05 0:14
 */
public class Test {
    public static void main(String[] args) {
        Client client = new Client(new ContreteFactory1());
        client.a.independence(client.b);

        client = new Client(new ContreteFactory2());
        client.a.independence(client.b);
    }
}
