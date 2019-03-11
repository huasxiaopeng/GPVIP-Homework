package lkricytbz.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author lktbz
 * @Title: PrototypeTest
 * @Description: 测试类
 * @date 2019/3/11
 */


public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原始单据集合
        List<Order> srcOrders = new ArrayList<Order>();
        // 原始采购单
        PurchaseOrder srcPurchaseOrder = new PurchaseOrder("c0f55f62-4979-4e87-8cd9-1c556894e2bb",new Date(new GregorianCalendar(2017,0,25).getTimeInMillis()),"张三","婴儿口水巾",400);
        srcOrders.add(srcPurchaseOrder);
        // 原始销售单
        SalesOrder srcSalesOrder = new SalesOrder("12fb4958-bee2-4c89-8cf8-edea1177b21f",new Date(new GregorianCalendar(2017,0,13).getTimeInMillis()),"张三","婴儿车",1,1280.0f);
        srcOrders.add(srcSalesOrder);
        // 单据管理类对象
        OrderMgmt orderMgmt = new OrderMgmt();
        orderMgmt.refAdd(srcOrders);

    }
}
