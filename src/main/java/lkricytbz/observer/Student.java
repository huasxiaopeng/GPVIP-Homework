package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: Student
 * @Description: ѧ�����¼��ķ�����
 * @date 2019/3/18
 */
public class Student  implements  CreateEventer   {

    public Student(String name) {
        this.name = name;
    }

    /**
     * �ĸ�ѧ��
     */
    private  String name;
    public Question create(String question) {
        return new Question(this,question);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
