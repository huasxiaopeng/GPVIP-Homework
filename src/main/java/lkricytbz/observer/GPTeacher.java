package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: GPTeacher
 * @Description: ѧУ��ʦ��Ҫ�����¼�
 * @date 2019/3/18
 */
public class GPTeacher implements  SubEventer {
    public GPTeacher(String name) {
        this.name = name;
    }

    private  String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void event(GPSocial gpSocial) {
        System.out.println(this.name+"��ʦ���ð���");
        System.out.println("ѧ��"+gpSocial.getQuestion().getStudent().
        getName()+"�����"+gpSocial.getQuestion().getName()+"��Ҫ��ȥ��𡣡�����");
    }
}
