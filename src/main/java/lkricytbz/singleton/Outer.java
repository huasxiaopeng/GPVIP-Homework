package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: Outer
 * @Description: 此类证明内部类的执行过程，只有被调用的时候才会被加载
 * @date 2019/3/10
 */
public class Outer {
    static {
        System.out.println("load outer class...");
    }
    //静态内部类
    static class StaticInner {
        static {
            System.out.println("load static inner class...");
        }
        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();      //此刻其内部类是否也会被加载？
        System.out.println("===========分割线===========");
        Outer.StaticInner.staticInnerMethod();      //调用内部类的静态方法
    }
}
