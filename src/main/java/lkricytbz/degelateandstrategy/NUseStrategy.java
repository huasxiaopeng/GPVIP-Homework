package lkricytbz.degelateandstrategy;

/**
 * @author lktbz
 * @Title: NUseStrategy
 * @Description: 未使用策略模式
 * @date 2019/3/14
 */

public class NUseStrategy {
    /**
     * 假如写一个针对员工上班不遵守制度做相应惩罚的程序，比如，上班迟到：罚100；
     * 上班睡觉：罚1000；上班早退：警告；上班玩游戏：严重警告；上班谈恋爱：开除等，通常都会这样写：
     */
    public static void punish(String state){
        if ("late".equals(state)){
            System.out.println("罚100");
        }else if ("sleep".equals(state)){
            System.out.println("罚1000");
        }else if ("early".equals(state)){
            System.out.println("警告");
        }else if ("play".equals(state)){
            System.out.println("严重警告");
        }else if ("love".equals(state)){
            System.out.println("开除");
        }
    }
    public static void main(String[] agrs){
        String state ="play";
        punish(state);
    }
}
