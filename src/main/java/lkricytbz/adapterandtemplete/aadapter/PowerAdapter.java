package lkricytbz.adapterandtemplete.aadapter;

/**
 * @author lktbz
 * @Title: PowerAdapter
 * @Description: 电源适配器 PowerAdapter 类
 * @date 2019/3/17
 */
public class PowerAdapter implements  DC5 {
    private  AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }
    @Override
    public int outputDC5V() {
        int ac220V = ac220.outputAC220V();
//        转换后的5v
        int i = ac220V / 44;
        System.out.println("转换后的是"+i+"v");
        return i;
    }
}
