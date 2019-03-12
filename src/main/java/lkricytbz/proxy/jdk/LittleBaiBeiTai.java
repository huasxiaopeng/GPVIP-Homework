package lkricytbz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lktbz
 * @Title: LittleBaiBeiTai
 * @Description:  备胎小白同学，就喜欢帮助各种人去买冰激凌
 * @date 2019/3/12
 */
public class LittleBaiBeiTai implements InvocationHandler {
    private  Object target;
    //代理对象
    public  Object getInstance(Object target){
        this.target=target;
        Class<?> aClass = target.getClass();
         return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //进行方法增强
        before();
        Object o = method.invoke(this.target, args);
        //方法增强
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
