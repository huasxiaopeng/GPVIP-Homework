package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: LazySingletonLock03
 * @Description: ����ʽ����
 * @date 2019/3/10
 */
public class LazySingletonLock03 {
    private LazySingletonLock03(){}
    private  static  LazySingletonLock03 lazy=null;
    public synchronized static LazySingletonLock03 getInstance(){
        if(lazy==null){
            lazy=new LazySingletonLock03();
        }
        return  lazy;
    }
}
