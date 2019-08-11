package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 审批人
 * @author Tsing Tse
 * @date 2019-08-11 18:09
 */
public abstract class Approver {

    public Approver approver;

    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver){
        this.approver = approver;
    }

    /**
     * 给子类覆盖的请求链
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
