package lkricytbz.prototype;

import java.util.Date;

/**
 * @author lktbz
 * @Title: SalesOrder
 * @Description: 销售单
 * @date 2019/3/11
 */
public class SalesOrder extends Order{

    private String productName;

    private int count;

    private double unitPrice;

    public SalesOrder(String id, Date createTime, String creator, String productName, int count, double unitPrice) {
        super(id, createTime, creator, "销售单");
        this.productName = productName;
        this.count = count;
        this.unitPrice = unitPrice;
    }

    public SalesOrder(Order order, String productName, int count, double unitPrice) {
        super(order.getId(),order.getCreateTime(),order.getCreator(), "销售单");
        this.productName = productName;
        this.count = count;
        this.unitPrice = unitPrice;
    }

    @Override
    public SalesOrder clone() throws CloneNotSupportedException {
        // 新单据
        SalesOrder newOrder = new SalesOrder(super.clone(),this.productName,this.count,0.0f);
        return newOrder;
    }



    @Override
    public String toString() {
        return super.toString()+"产品名称："+this.productName+"\n数量："+this.count+"\n单价："+unitPrice+"\n";
    }

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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
