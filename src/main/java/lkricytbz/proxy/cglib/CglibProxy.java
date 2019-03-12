package lkricytbz.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lktbz
 * @Title: CglibProxy
 * @Description: Cglib 代理对象
 * @date 2019/3/12
 */
public class CglibProxy implements MethodInterceptor {
//    代理对象
    public Object getInstance(Class<?>clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object o = proxy.invokeSuper(obj, args);
        after();
        return o;
    }
    private void  before(){
        System.out.println("我是备胎小白，我正在买冰激凌给女神吃");
    }
    private  void after(){
        System.out.println("我已经买好了，正在送给女神的路上");
    }
}
