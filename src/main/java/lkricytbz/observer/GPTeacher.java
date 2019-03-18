package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: GPTeacher
 * @Description: 学校老师需要订阅事件
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
        System.out.println(this.name+"老师您好啊！");
        System.out.println("学生"+gpSocial.getQuestion().getStudent().
        getName()+"提出了"+gpSocial.getQuestion().getName()+"需要你去解答。。。。");
    }
}
