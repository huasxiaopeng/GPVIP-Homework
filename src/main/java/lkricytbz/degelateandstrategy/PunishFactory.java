package lkricytbz.degelateandstrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lktbz
 * @Title: PunishFactory
 * @Description: 工厂处罚策略
 * @date 2019/3/14
 */
public class PunishFactory {
    public PunishFactory() {
    }

    public static  final String EARLY="early";
    public static  final String LATER="later";
    public static  final String SLEEP="sleep";
    public static final String DEFAULT = EARLY;
    private  static Map<String ,IPunish> msp=new HashMap<>();
     static {
        msp.put(EARLY, new EarlyPunish());
        msp.put(LATER, new LatePunish());
        msp.put(SLEEP, new SleepPunish());
    }

    public static IPunish get(String keys){
        if(!msp.containsKey(keys)){
            return msp.get(DEFAULT);
        }
        return  msp.get(keys);
    }

}
