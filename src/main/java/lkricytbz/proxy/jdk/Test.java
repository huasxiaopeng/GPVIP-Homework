package lkricytbz.proxy.jdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lktbz
 * @Title: Test
 * @Description: ≤‚ ‘¿‡
 * @date 2019/3/12
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object o = new LittleBaiBeiTai().getInstance(new LittleHua());
        Method iceCream = o.getClass().getMethod("wantEatIceCream", null);
        iceCream.invoke(o);
    }
}
