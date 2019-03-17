package lkricytbz.adapterandtemplete.aadapter.login;

/**
 * @author lktbz
 * @Title: SigninForThirdServiceTest
 * @Description: TODO
 * @date 2019/3/17
 */
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService();
//不改变原来的代码，也要能够兼容新的需求
//还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");
    }
}
