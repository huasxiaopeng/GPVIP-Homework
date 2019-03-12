package lkricytbz.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lktbz
 * @Title: CglibProxy
 * @Description: Cglib �������
 * @date 2019/3/12
 */
public class CglibProxy implements MethodInterceptor {
//    �������
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
        System.out.println("���Ǳ�̥С�ף���������������Ů���");
    }
    private  void after(){
        System.out.println("���Ѿ�����ˣ������͸�Ů���·��");
    }
}
