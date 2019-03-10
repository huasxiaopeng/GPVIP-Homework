package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: LaztSingletonDoubleLock04
 * @Description: double check ¿¡∫∫ Ω
 * @date 2019/3/10
 */
public class LaztSingletonDoubleLock04 {
    private LaztSingletonDoubleLock04(){}
    private  static  LaztSingletonDoubleLock04 lazy=null;
    public static LaztSingletonDoubleLock04 getInstance(){
        if(lazy==null){
            synchronized (LaztSingletonDoubleLock04.class){
                if(lazy==null){
                    lazy=new LaztSingletonDoubleLock04();
                }
            }
        }
        return  lazy;
    }
}
