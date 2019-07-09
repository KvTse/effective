package cn.kvtse.study.designer.structure.composite;

/**
 * 组合模式用来解决类似于:学校,院系,专业这种组成关系的情景.
 *
 * 1.简化客户端的操作
 * 2.具有较强的扩展性,客户端可以不做调整.
 * 3.方便创建复杂的层次结构.
 * 4.需要遍历组织机构,或者处理的对象具有树形结构时,适合使用组合模式.
 * 5.要求有较高的抽象,也就是说如果叶子节点和节点有很多差异性的话,不适合使用组合模式
 *
 *
 * @author Tsing Tse
 * @date 2019-07-07 13:44
 */
public class Client {
    public static void main(String[] args) {
        AbstractOrganization university = new University("University","清华大学");
        AbstractOrganization college1 = new College("计算机系", "计算机系");
        university.add(college1);
        AbstractOrganization college2 = new College("英语系", "英语系");
        university.add(college2);
        college1.add(new Department("java","java学院"));
        college1.add(new Department("C++","C++学院"));
        college2.add(new Department("英国历史","英国历史"));
        college2.add(new Department("美国历史","美国历史"));
        university.show();
    }
}
