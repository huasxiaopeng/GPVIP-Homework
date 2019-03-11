package lkricytbz.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author lktbz
 * @Title: PrototypeTest
 * @Description: ������
 * @date 2019/3/11
 */


public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // ԭʼ���ݼ���
        List<Order> srcOrders = new ArrayList<Order>();
        // ԭʼ�ɹ���
        PurchaseOrder srcPurchaseOrder = new PurchaseOrder("c0f55f62-4979-4e87-8cd9-1c556894e2bb",new Date(new GregorianCalendar(2017,0,25).getTimeInMillis()),"����","Ӥ����ˮ��",400);
        srcOrders.add(srcPurchaseOrder);
        // ԭʼ���۵�
        SalesOrder srcSalesOrder = new SalesOrder("12fb4958-bee2-4c89-8cf8-edea1177b21f",new Date(new GregorianCalendar(2017,0,13).getTimeInMillis()),"����","Ӥ����",1,1280.0f);
        srcOrders.add(srcSalesOrder);
        // ���ݹ��������
        OrderMgmt orderMgmt = new OrderMgmt();
        orderMgmt.refAdd(srcOrders);

    }
}
