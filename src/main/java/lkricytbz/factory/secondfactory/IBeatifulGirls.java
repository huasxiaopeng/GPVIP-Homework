package lkricytbz.factory.secondfactory;

import lkricytbz.factory.bean.BeautifulGirls;
import lkricytbz.factory.bean.Girls;

/**
 * @author Ð¡¸ç
 * @Title: IBeatifulGirls
 * @Description: TODO
 * @date 2019/3/922:30
 */
public class IBeatifulGirls implements IGirls {
    public Girls createEat() {
        return  new BeautifulGirls();
    }
}
