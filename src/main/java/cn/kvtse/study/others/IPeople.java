package cn.kvtse.study.others;

public interface IPeople {
    default void getName(){
        System.out.println("I am IPeople");
    }
}
