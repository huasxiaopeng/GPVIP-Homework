package lkricytbz.adapterandtemplete.aadapter.login;

/**
 * @author lktbz
 * @Title: SiginServiceImpl
 * @Description: TODO
 * @date 2019/3/17
 */
public class SiginServiceImpl extends SiginService {

    /**
     * ע�᷽��
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg regist(String username, String password){
        //ע���߼��ԡ�����
        return new ResultMsg(200,"ע��ɹ�",new Member());
    }


    /**
     * ��¼�ķ���
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username,String password){
        //��¼�߼��ԡ�����
        return new ResultMsg(200,"��¼�ɹ�",new Member());
    }

}
