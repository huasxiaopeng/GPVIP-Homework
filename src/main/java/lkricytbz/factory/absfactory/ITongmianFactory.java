package lkricytbz.factory.absfactory;

/**
 * @author lktbz
 * @Title: ITongmianFactory
 * @Description: ����Ͱ��ķ����湤��
 * @date 2019/3/9
 */
public interface ITongmianFactory {
    ItiaoliaoFactory creatTiaoliaoFc();
    ImianFactory  createMianFc();
    IzhitongFactory  createZhitongFc();
}
