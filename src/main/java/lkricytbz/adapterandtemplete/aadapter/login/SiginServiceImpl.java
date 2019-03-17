package lkricytbz.adapterandtemplete.aadapter.login;

/**
 * @author lktbz
 * @Title: SiginServiceImpl
 * @Description: TODO
 * @date 2019/3/17
 */
public class SiginServiceImpl extends SiginService {

    /**
     * ×¢²á·½·¨
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg regist(String username, String password){
        //×¢²áÂß¼­ÂÔ¡£¡£¡£
        return new ResultMsg(200,"×¢²á³É¹¦",new Member());
    }


    /**
     * µÇÂ¼µÄ·½·¨
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username,String password){
        //µÇÂ¼Âß¼­ÂÔ¡£¡£¡£
        return new ResultMsg(200,"µÇÂ¼³É¹¦",new Member());
    }

}
