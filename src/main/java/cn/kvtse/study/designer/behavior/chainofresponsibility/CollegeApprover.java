package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 学院审核
 *
 * @author Tsing Tse
 * @date 2019-08-11 21:54
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (5000<purchaseRequest.getPrice() && purchaseRequest.getPrice()<10000){
            System.out.println("College approver 审核...");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
