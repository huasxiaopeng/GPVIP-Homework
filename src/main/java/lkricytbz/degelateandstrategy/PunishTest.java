package lkricytbz.degelateandstrategy;

/**
 * @author lktbz
 * @Title: PunishTest
 * @Description: ≤‚ ‘¿‡
 * @date 2019/3/14
 */
public class PunishTest {
    public static void main(String[] args) {
        IPunish iPunish = PunishFactory.get(PunishFactory.LATER);
        iPunish.expush();


    }
}
