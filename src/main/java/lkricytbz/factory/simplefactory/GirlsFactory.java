package lkricytbz.factory.simplefactory;

import lkricytbz.factory.bean.BeautifulGirls;
import lkricytbz.factory.bean.Girls;
import lkricytbz.factory.bean.WomanGirls;

/**
 * @author Ð¡¸ç
 * @Title: GirlsFactory
 * @Description: TODO
 * @date 2019/3/922:24
 */
    public class GirlsFactory {
    public static Girls createGrils(String type) {
        if (type == "BeautifulGirls") {
            return  new BeautifulGirls();
        } else if (type == "WomanGirls") {
            return  new WomanGirls();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Girls girls =GirlsFactory.createGrils("BeautifulGirls");
        girls.eat();
        Girls girls2 =GirlsFactory.createGrils("WomanGirls");
        girls2.eat();
    }
}