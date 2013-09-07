/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/17/13
 * Time: 1:55 AM
 * To change this template use File | Settings | File Templates.
 */
package com.desu.service;

import com.desu.dao.UserDAO;
//import com.desu.form.PersonRowMapper;
import com.desu.form.User;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


//@Component()
@Service
public class UserService  {
/*    @Autowired
    private JdbcTemplate jdbcTemplate;*/

/*    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }*/
    public UserService(){

    }
    @Autowired
    private UserDAO userDAO;

/*    @Autowired
    public UserService(UserDAO userDAO){
       this.userDAO = userDAO;
    }*/
    public List<User> listAllUsers(){
        return userDAO.listAllUsers();
    }

    public void addUserDetails(User user){
        userDAO.addUserDetails(user);
    }

    public void deleteUserDetails(int id){
        userDAO.deleteUserDetails(id);
    }

    public void  updateUserDetails(User user){
        userDAO.updateUserDetails(user);
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
