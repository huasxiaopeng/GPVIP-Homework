package lkricytbz.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lktbz
 * @Title: OrderMgmt
 * @Description: ���ݹ���
 * @date 2019/3/11
 */
public class OrderMgmt {

    public void refAdd(List<Order> srcOrders) throws CloneNotSupportedException {
        System.out.println("ԭʼ���ݣ�");
        for (Order srcOrder : srcOrders) {
            System.out.print(srcOrder.toString());
            System.out.println("------------------------------------------------------------------------");
        }
        // Ŀ�굥��
        List<Order> desOrders = new ArrayList<Order>();
        for (Order srcOrder : srcOrders) {
            // Ŀ�굥��
            Order desOrder = srcOrder.clone();
            if(desOrder instanceof SalesOrder){
                ((SalesOrder) desOrder).setUnitPrice(getUnitPrice(((SalesOrder) desOrder).getProductName()));
            }
            desOrders.add(desOrder);
        }
        System.out.println("�������ݣ�");
        for (Order desOrder : desOrders) {
            System.out.print(desOrder.toString());
            System.out.println("------------------------------------------------------------------------");
        }
    }
    private double getUnitPrice(String productName){
        // ����
        double unitPrice = 0.0f;
        if("Ӥ����".equals(productName)){
            unitPrice = 999.0f;
        }
        return unitPrice;
    }

}
