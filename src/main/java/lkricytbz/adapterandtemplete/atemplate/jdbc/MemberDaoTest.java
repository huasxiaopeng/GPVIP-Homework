package lkricytbz.adapterandtemplete.atemplate.jdbc;

import java.util.List;

/**
 * @author lktbz
 * @Title: MemberDaoTest
 * @Description: TODO
 * @date 2019/3/17
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);

    }
}
