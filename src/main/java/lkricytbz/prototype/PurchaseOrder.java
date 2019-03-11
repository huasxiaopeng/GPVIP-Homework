package lkricytbz.prototype;

import java.util.Date;

/**
 * @author lktbz
 * @Title: PurchaseOrder
 * @Description: 采购单
 * @date 2019/3/11
 */
public class PurchaseOrder  extends  Order{
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String productName;

    private int count;


    public PurchaseOrder(String id, Date createTime, String creator, String productName, int count) {
        super(id, createTime, creator, "采购单");
        this.productName=productName;
        this.count=count;
    }



    public PurchaseOrder(Order order,String productName,int count) {
        super(order.getId(), order.getCreateTime(), order.getCreator(), "采购单");
        this.productName=productName;
        this.count=count;
    }


    @Override
    public PurchaseOrder clone() throws CloneNotSupportedException {
        // 新单据
        PurchaseOrder newOrder = new PurchaseOrder(super.clone(),this.productName,this.count);
        return newOrder;
    }


    @Override
    public String toString() {
        return super.toString()+"产品名称："+this.productName+"\n数量："+this.count+"\n";
    }

}
