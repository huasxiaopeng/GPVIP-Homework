package lkricytbz.proxy.cglib;

/**
 * @author lktbz
 * @Title: CgTest
 * @Description: TODO
 * @date 2019/3/12
 */
public class CgTest {
    public static void main(String[] args) {
        CglibBeiTaiXiaoBai instance = (CglibBeiTaiXiaoBai)new CglibProxy().getInstance(new CglibBeiTaiXiaoBai().getClass());
        System.out.println(instance);
        instance.wantEatIceCream();
    }
}
