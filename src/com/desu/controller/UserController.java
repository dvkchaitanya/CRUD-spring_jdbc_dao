package com.desu.controller;

import com.desu.form.User;
import com.desu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/16/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class UserController {
//    private
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all" ,method = RequestMethod.GET)
    public String showAllUsers(Model model){
//        model.addAttribute()
       List<User> userList = userService.listAllUsers();
       model.addAttribute("usersList",userList);
        return "allUsers";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addUserDetails(ModelMap model){
        User user = new User();
        model.addAttribute("user",user);
        return "userDetailsForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String handleAddedUserDetails(@ModelAttribute(value = "user") User user,BindingResult result){
        userService.addUserDetails(user);
        return "redirect:/user/all";
    }
    
    @RequestMapping(value = "/delete")
    public String handleDeleteUserDetails(@RequestParam(value = "id") int id ){
        userService.deleteUserDetails(id);
        return "redirect:/user/all";
    }

    @RequestMapping(value = "/updateInit")
    public String  showUpdateUserDetailsForm(@RequestParam(value = "id") int id,ModelMap model){
        User user = new User();
        user.setId(id);
        model.addAttribute("user",user);
        return "handleUpdateUserDetailsForm";
    }
    
    @RequestMapping(value = "/update",method = RequestMethod.POST )
    public  String handleUpdateUserDetails(@ModelAttribute(value = "user") User user){
        userService.updateUserDetails(user);
        return "redirect:/user/all";
    }
}
