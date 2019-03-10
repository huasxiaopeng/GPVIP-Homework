package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: LazySingleton02
 * @Description: ¿¡∫∫ Ω≥ı º–¥∑®
 * @date 2019/3/10
 */
public class LazySingleton02 {
    private LazySingleton02(){}
    private  static  LazySingleton02 lazy=null;
    public static LazySingleton02 getInstance(){
        if(lazy==null){
            lazy=new LazySingleton02();
        }
        return   lazy;
    }
}
