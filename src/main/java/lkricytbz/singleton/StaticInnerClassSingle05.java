package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: StaticInnerClassSingle05
 * @Description: ��̬�ڲ���ʽд��(��ţ�Ƶ�д���������·��䣬���������ͨ�����캯�������쳣���)
 * @date 2019/3/10
 */
public class StaticInnerClassSingle05 {
    private StaticInnerClassSingle05(){}
    private static class  StaticInnerHolder{
        private static  StaticInnerClassSingle05 holder =new StaticInnerClassSingle05();
    }
    public static  StaticInnerClassSingle05 getInstance(){
        return  StaticInnerHolder.holder;
    }
}
