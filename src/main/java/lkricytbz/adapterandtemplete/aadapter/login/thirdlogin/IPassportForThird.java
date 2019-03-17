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
     * QQ µÇÂ¼
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * Î¢ÐÅµÇÂ¼
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * ¼Ç×¡µÇÂ¼×´Ì¬ºó×Ô¶¯µÇÂ¼
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * ÊÖ»úºÅµÇÂ¼
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * ×¢²áºó×Ô¶¯µÇÂ¼
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
