package lkricytbz.adapterandtemplete.atemplate.jdbc;

import java.sql.ResultSet;

/**
 * @author lktbz
 * @Title: RowMapper
 * @Description: TODO
 * @date 2019/3/17
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws  Exception;
}
