package cn.kvtse.study.jdk.jvm.clazz.bean;

public class MyPerson {
    private MyPerson myPerson;
    private static int i = 0;
    public void setMyPerson(Object object) {
        this.myPerson = (MyPerson)object;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        MyPerson.i = i;
    }

    public static void main(String[] args) {
        MyPerson myPerson = new MyPerson();
        myPerson.setI(10);
        MyPerson myPerson2 = new MyPerson();
        System.out.println(myPerson2.getI());
    }
}
