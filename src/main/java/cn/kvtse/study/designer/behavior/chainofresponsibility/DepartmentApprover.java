package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 部门审核
 *
 * @author Tsing Tse
 * @date 2019-08-11 21:44
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println(" Department approver " + purchaseRequest.getId());
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
