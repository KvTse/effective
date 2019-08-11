package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 责任链客户端
 *
 * @author Tsing Tse
 * @date 2019-08-11 22:18
 */
public class Client {
    public static void main(String[] args) {

        PurchaseRequest purchaseRequest = new PurchaseRequest("1",33000f,"2");

        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        PresidentApprover presidentApprover = new PresidentApprover("校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(presidentApprover);
        presidentApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);

    }
}
