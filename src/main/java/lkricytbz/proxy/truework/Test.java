package lkricytbz.proxy.truework;

import java.lang.reflect.Proxy;

/**
 * @author lktbz
 * @Title: Test
 * @Description: 测试类
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
        System.out.println("名字是: " + ownerProxy.getName());
        ownerProxy.setInterests("保龄球");
        System.out.println("能设置兴趣");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("不能设置 评分 属性");
        }
        System.out.println(" 评分 。。。。。 " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("名字是： " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("保龄球。。。。。");
        } catch (Exception e) {
            System.out.println("不能设置兴趣");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("评分 可以设置");
        System.out.println(" 设置的 评分  " + nonOwnerProxy.getHotOrNotRating());

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
