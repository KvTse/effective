package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 部门审核
 *
 * @author Tsing Tse
 * @date 2019-08-11 21:44
 */
public class PresidentApprover extends Approver {

    public PresidentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000){
            System.out.println(" President Approver " + purchaseRequest.getId());
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
