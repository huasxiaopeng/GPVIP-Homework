package lkricytbz.proxy.truework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lktbz
 * @Title: NonOwnerInvocationHandler
 * @Description: TODO
 * @date 2019/3/12
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw  new IllegalAccessException();
            }
        } catch (InvocationTargetException e) { //
            e.printStackTrace();
        }
        return null;
    }

}
