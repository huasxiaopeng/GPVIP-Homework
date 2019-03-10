package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: Outer
 * @Description: ����֤���ڲ����ִ�й��̣�ֻ�б����õ�ʱ��Żᱻ����
 * @date 2019/3/10
 */
public class Outer {
    static {
        System.out.println("load outer class...");
    }
    //��̬�ڲ���
    static class StaticInner {
        static {
            System.out.println("load static inner class...");
        }
        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();      //�˿����ڲ����Ƿ�Ҳ�ᱻ���أ�
        System.out.println("===========�ָ���===========");
        Outer.StaticInner.staticInnerMethod();      //�����ڲ���ľ�̬����
    }
}
