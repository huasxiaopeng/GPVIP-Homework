package lkricytbz.adapterandtemplete.atemplate.course;

/**
 * @author lktbz
 * @Title: PythonCourse
 * @Description: TODO
 * @date 2019/3/17
 */
public class PythonCourse extends  NetworkCourse {
    private boolean needHomeworkFlag = false;

    public PythonCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("¼ì²é python ×÷Òµ");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
