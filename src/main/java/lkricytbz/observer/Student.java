package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: Student
 * @Description: 学生是事件的发送者
 * @date 2019/3/18
 */
public class Student  implements  CreateEventer   {

    public Student(String name) {
        this.name = name;
    }

    /**
     * 哪个学生
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
