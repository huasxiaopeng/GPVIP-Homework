package lkricytbz.adapterandtemplete.aadapter;

/**
 * @author lktbz
 * @Title: PowerAdapter
 * @Description: ��Դ������ PowerAdapter ��
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
//        ת�����5v
        int i = ac220V / 44;
        System.out.println("ת�������"+i+"v");
        return i;
    }
}
