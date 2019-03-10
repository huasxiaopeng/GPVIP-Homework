package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: HugrySIngleton01
 * @Description: 此类为饿汉式单例写法
 * @date 2019/3/10
 */
public class HugrySIngleton01 {
    public HugrySIngleton01() {
    }

    private  static  HugrySIngleton01 hugry=new HugrySIngleton01();

    public  static  HugrySIngleton01 getInstance(){
        return hugry;
    }
}
