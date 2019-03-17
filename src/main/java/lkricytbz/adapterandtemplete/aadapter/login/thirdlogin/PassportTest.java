package lkricytbz.adapterandtemplete.aadapter.login.thirdlogin;

/**
 * @author lktbz
 * @Title: PassportTest
 * @Description: TODO
 * @date 2019/3/17
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
