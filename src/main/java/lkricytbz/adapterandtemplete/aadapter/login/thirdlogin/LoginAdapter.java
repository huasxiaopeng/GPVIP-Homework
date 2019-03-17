package lkricytbz.adapterandtemplete.aadapter.login.thirdlogin;

import lkricytbz.adapterandtemplete.aadapter.login.ResultMsg;

/**
 * @author lktbz
 * @Title: LoginAdapter
 * @Description: TODO
 * @date 2019/3/17
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
