package lkricytbz.factory.absfactory;

/**
 * @author lktbz
 * @Title: KangShiFuTongMian
 * @Description: TODO
 * @date 2019/3/9
 */
public class KangShiFuTongMian implements  ITongmianFactory {
    public ItiaoliaoFactory creatTiaoliaoFc() {
        return new KangShiFuTiaoLiao();
    }

    public ImianFactory createMianFc() {
        return new KangShiFuMian();
    }

    public IzhitongFactory createZhitongFc() {
        return new KangShiFuZhiTong();
    }
}
