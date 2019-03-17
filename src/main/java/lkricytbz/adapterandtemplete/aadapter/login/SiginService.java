package lkricytbz.adapterandtemplete.aadapter.login;

/**
 * @author lktbz
 * @Title: SiginService
 * @Description: ÀÏÏµÍ³µÄµÇÂ¼Âß¼­
 * @date 2019/3/17
 */
public class SiginService {
    /**
     * ×¢²á
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"×¢²á³É¹¦",new Member());
    }

    /**
     * µÇÂ¼
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
