package com.desu.form;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/18/13
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
         User user = new User();
        user.setId(resultSet.getInt("tid"));
        user.setUserName(resultSet.getString("userName"));
        user.setCity(resultSet.getString("city"));
        return user;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
