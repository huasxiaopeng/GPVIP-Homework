package lkricytbz.adapterandtemplete.atemplate.course;

/**
 * @author lktbz
 * @Title: NetworkCourseTest
 * @Description: TODO
 * @date 2019/3/17
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("----java----");
        NetworkCourse javaCourse = new JavaCource();
        javaCourse.createCourse();
        System.out.println("----python----");
        NetworkCourse pythonCourse = new PythonCourse(true);
        pythonCourse.createCourse();

    }
}
