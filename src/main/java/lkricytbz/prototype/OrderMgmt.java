package lkricytbz.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lktbz
 * @Title: OrderMgmt
 * @Description: 单据管理
 * @date 2019/3/11
 */
public class OrderMgmt {

    public void refAdd(List<Order> srcOrders) throws CloneNotSupportedException {
        System.out.println("原始单据：");
        for (Order srcOrder : srcOrders) {
            System.out.print(srcOrder.toString());
            System.out.println("------------------------------------------------------------------------");
        }
        // 目标单据
        List<Order> desOrders = new ArrayList<Order>();
        for (Order srcOrder : srcOrders) {
            // 目标单据
            Order desOrder = srcOrder.clone();
            if(desOrder instanceof SalesOrder){
                ((SalesOrder) desOrder).setUnitPrice(getUnitPrice(((SalesOrder) desOrder).getProductName()));
            }
            desOrders.add(desOrder);
        }
        System.out.println("新增单据：");
        for (Order desOrder : desOrders) {
            System.out.print(desOrder.toString());
            System.out.println("------------------------------------------------------------------------");
        }
    }
    private double getUnitPrice(String productName){
        // 单价
        double unitPrice = 0.0f;
        if("婴儿车".equals(productName)){
            unitPrice = 999.0f;
        }
        return unitPrice;
    }

}
