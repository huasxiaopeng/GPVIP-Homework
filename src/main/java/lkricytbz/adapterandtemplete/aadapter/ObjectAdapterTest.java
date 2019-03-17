package lkricytbz.adapterandtemplete.aadapter;

/**
 * @author lktbz
 * @Title: ObjectAdapterTest
 * @Description: TODO
 * @date 2019/3/17
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {

        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
