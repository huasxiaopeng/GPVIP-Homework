package lkricytbz.adapterandtemplete.aadapter.login;

/**
 * @author lktbz
 * @Title: SiginService
 * @Description: ��ϵͳ�ĵ�¼�߼�
 * @date 2019/3/17
 */
public class SiginService {
    /**
     * ע��
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"ע��ɹ�",new Member());
    }

    /**
     * ��¼
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
