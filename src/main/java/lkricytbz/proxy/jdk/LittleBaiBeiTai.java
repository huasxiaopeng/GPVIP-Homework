package lkricytbz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lktbz
 * @Title: LittleBaiBeiTai
 * @Description:  ��̥С��ͬѧ����ϲ������������ȥ�������
 * @date 2019/3/12
 */
public class LittleBaiBeiTai implements InvocationHandler {
    private  Object target;
    //�������
    public  Object getInstance(Object target){
        this.target=target;
        Class<?> aClass = target.getClass();
         return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //���з�����ǿ
        before();
        Object o = method.invoke(this.target, args);
        //������ǿ
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
