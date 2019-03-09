package lkricytbz.factory.absfactory;

/**
 * @author lktbz
 * @Title: AbsFactory
 * @Description: TODO
 * @date 2019/3/9
 */
public class AbsFactory {
    public static void main(String[] args) {
        ITongmianFactory tm =new KangShiFuTongMian();
        tm.createMianFc().createMian();
        tm.createZhitongFc().createZhitong();
        tm.creatTiaoliaoFc().creatTiaoliao();
    }
}
