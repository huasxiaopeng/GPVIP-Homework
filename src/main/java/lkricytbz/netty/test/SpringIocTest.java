package lkricytbz.netty.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lktbz
 * @Title: SpringIocTest
 * @Description: TODO
 * @date 2019/3/15
 */
public class SpringIocTest {
    public SpringIocTest() {
    }
    private  static Map<String ,Object> msps=new ConcurrentHashMap<>();
    public Object getBean(String keys){
        if(!msps.containsKey(keys)){
            Object obj=null;
            try{
               obj= Class.forName(keys).newInstance();
               msps.put(keys, obj);
            }catch (Exception e){
                e.printStackTrace();
            }
            return  obj ;
        }else {
            return  msps.get(keys);
        }
    }
}
