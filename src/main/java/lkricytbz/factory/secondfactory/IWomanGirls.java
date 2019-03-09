package lkricytbz.factory.secondfactory;

import lkricytbz.factory.bean.Girls;
import lkricytbz.factory.bean.WomanGirls;

/**
 * @author Ð¡¸ç
 * @Title: IWomanGirls
 * @Description: TODO
 * @date 2019/3/922:31
 */
public class IWomanGirls implements  IGirls {
    public Girls createEat() {
        return new WomanGirls();
    }
}
