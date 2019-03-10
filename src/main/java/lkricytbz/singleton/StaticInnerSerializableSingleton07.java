package lkricytbz.singleton;

import java.io.Serializable;

/**
 * @author lktbz
 * @Title: StaticInnerSerializableSingleton07
 * @Description: 静态内部类序列化的方式
 * @date 2019/3/10
 */
public class StaticInnerSerializableSingleton07  implements Serializable {

    private static final long serialVersionUID = 1L;
    private StaticInnerSerializableSingleton07(){}
    private static class  StaticInnerHolder07{
        private static  StaticInnerSerializableSingleton07 holder =new StaticInnerSerializableSingleton07();
    }
    public static  StaticInnerSerializableSingleton07 getInstance(){
        return  StaticInnerSerializableSingleton07.StaticInnerHolder07.holder;
    }
    /**
     * jdk 层面解决办法
     *
     */
    public static Object readResolve(){
        return StaticInnerHolder07.holder;
    }

}
