package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: StaticInnerClassSingle05
 * @Description: 静态内部类式写法(很牛逼的写法，但是怕反射，解决方案，通过构造函数，抛异常解决)
 * @date 2019/3/10
 */
public class StaticInnerClassSingle05 {
    private StaticInnerClassSingle05(){}
    private static class  StaticInnerHolder{
        private static  StaticInnerClassSingle05 holder =new StaticInnerClassSingle05();
    }
    public static  StaticInnerClassSingle05 getInstance(){
        return  StaticInnerHolder.holder;
    }
}
