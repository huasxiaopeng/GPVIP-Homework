package lkricytbz.adapterandtemplete.aadapter.login.thirdlogin;

import lkricytbz.adapterandtemplete.aadapter.login.ResultMsg;

/**
 * @author lktbz
 * @Title: IPassportForThird
 * @Description: TODO
 * @date 2019/3/17
 */
public interface IPassportForThird {
    /**
     * QQ ��¼
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * ΢�ŵ�¼
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * ��ס��¼״̬���Զ���¼
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * �ֻ��ŵ�¼
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * ע����Զ���¼
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
