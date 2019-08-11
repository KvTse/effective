package cn.kvtse.study.others;

/**
 *
 * 如果一个类实现了两个接口,而恰恰这两个接口中分别含有两个名称相同的默认方法
 * 则子类需要重写这个方法.当然,如果接口没有默认的方法,则子类必须重写.
 * @author Tsing Tse
 * @date 2019-08-01 10:10
 */
public class PersonPeople implements IPeople,IPerson {
    @Override
    public void getName() {

    }
}
