package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: Question
 * @Description: TODO
 * @date 2019/3/18
 */
public class Question {
    public Question(Student student, String name) {
        this.student = student;
        this.name = name;
    }

    /**
     * 问题由学生提出
     */
    private  Student student;
    /**
     * 社区问题
     */
    private  String name;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
