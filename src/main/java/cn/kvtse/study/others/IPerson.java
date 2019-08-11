package cn.kvtse.study.others;

/**
 * @author Tsing Tse
 * @date 2019-08-01 10:08
 */
public interface IPerson {
    default void getName(){
        System.out.println("I am IPerson");
    }
}
