package lkricytbz.factory.secondfactory;

/**
 * @author Ð¡¸ç
 * @Title: TestGirls
 * @Description: TODO
 * @date 2019/3/922:31
 */
public class TestGirls {
    public static void main(String[] args) {
        IGirls iGirls =new IBeatifulGirls();
        iGirls.createEat().eat();
        IGirls iGirls2 =new IWomanGirls();
        iGirls2.createEat().eat();
    }
}
