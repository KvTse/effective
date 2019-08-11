package cn.kvtse.study.designer.behavior.chainofresponsibility;

/**
 * 购买请求
 * @author Tsing Tse
 * @date 2019-08-11 18:05
 */
public class PurchaseRequest {

    private String type;
    private float price;
    private String id;

    public PurchaseRequest(String type, float price, String id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
