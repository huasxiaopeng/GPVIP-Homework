package lkricytbz.adapterandtemplete.aadapter.login.thirdlogin;

import lkricytbz.adapterandtemplete.aadapter.login.ResultMsg;

/**
 * @author lktbz
 * @Title: LoginForQQAdapter
 * @Description: TODO
 * @date 2019/3/17
 */
public class LoginForQQAdapter  implements  LoginAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
