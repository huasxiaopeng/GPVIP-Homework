package lkricytbz.adapterandtemplete.aadapter.login.thirdlogin;

import lkricytbz.adapterandtemplete.aadapter.login.ResultMsg;

/**
 * @author lktbz
 * @Title: LoginForWechatAdapter
 * @Description: TODO
 * @date 2019/3/17
 */
public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
