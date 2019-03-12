package lkricytbz.proxy.truework;

import java.lang.reflect.Proxy;

/**
 * @author lktbz
 * @Title: Test
 * @Description: ������
 * @date 2019/3/12
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("tim"); joe.setGender("girl"); joe.setInterests("watch movies"); joe.setHotOrNotRating(0);
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("������: " + ownerProxy.getName());
        ownerProxy.setInterests("������");
        System.out.println("��������Ȥ");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("�������� ���� ����");
        }
        System.out.println(" ���� ���������� " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("�����ǣ� " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("�����򡣡�������");
        } catch (Exception e) {
            System.out.println("����������Ȥ");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("���� ��������");
        System.out.println(" ���õ� ����  " + nonOwnerProxy.getHotOrNotRating());

    }
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }


}
