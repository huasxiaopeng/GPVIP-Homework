package lkricytbz.observer;

/**
 * @author lktbz
 * @Title: GPSocial
 * @Description: GP����
 * @date 2019/3/18
 */
public class GPSocial {
    /*
         ����������
     */
    private String name;

    public GPSocial(String name, Question question) {
        this.name = name;
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
