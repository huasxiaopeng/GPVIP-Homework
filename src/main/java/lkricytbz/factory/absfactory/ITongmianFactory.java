package lkricytbz.factory.absfactory;

/**
 * @author lktbz
 * @Title: ITongmianFactory
 * @Description: 生产桶面的方便面工厂
 * @date 2019/3/9
 */
public interface ITongmianFactory {
    ItiaoliaoFactory creatTiaoliaoFc();
    ImianFactory  createMianFc();
    IzhitongFactory  createZhitongFc();
}
