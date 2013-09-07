package com.desu.dao;

import com.desu.form.PersonRowMapper;
import com.desu.form.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/22/13
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserDAO  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public List<User> listAllUsers(){
        String sql = "SELECT * FROM userdetails";
        return getJdbcTemplate().query(sql, new PersonRowMapper());
    }
    public void addUserDetails(User user){
        String sql = "INSERT INTO userdetails (userName, city) values (?,?)";
        getJdbcTemplate().update(sql,new Object[]{user.getUserName(),user.getCity()});
    }

    public void deleteUserDetails(int id){
        String sql ="DELETE FROM userdetails where tid='"+id+"'";
        getJdbcTemplate().update(sql);
    }

    public void  updateUserDetails(User user){
        String sql = "UPDATE userdetails SET userName='"+user.getUserName()
                +"', city= '"+user.getCity()+"' WHERE tid="+user.getId();
        getJdbcTemplate().update(sql);
    }
}
