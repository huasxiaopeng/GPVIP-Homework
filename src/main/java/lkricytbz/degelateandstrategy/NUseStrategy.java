package lkricytbz.degelateandstrategy;

/**
 * @author lktbz
 * @Title: NUseStrategy
 * @Description: δʹ�ò���ģʽ
 * @date 2019/3/14
 */

public class NUseStrategy {
    /**
     * ����дһ�����Ա���ϰ಻�����ƶ�����Ӧ�ͷ��ĳ��򣬱��磬�ϰ�ٵ�����100��
     * �ϰ�˯������1000���ϰ����ˣ����棻�ϰ�����Ϸ�����ؾ��棻�ϰ�̸�����������ȣ�ͨ����������д��
     */
    public static void punish(String state){
        if ("late".equals(state)){
            System.out.println("��100");
        }else if ("sleep".equals(state)){
            System.out.println("��1000");
        }else if ("early".equals(state)){
            System.out.println("����");
        }else if ("play".equals(state)){
            System.out.println("���ؾ���");
        }else if ("love".equals(state)){
            System.out.println("����");
        }
    }
    public static void main(String[] agrs){
        String state ="play";
        punish(state);
    }
}
