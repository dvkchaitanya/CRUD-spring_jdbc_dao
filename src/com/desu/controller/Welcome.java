package com.desu.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/8/13
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/welcome")
public class Welcome {

    @RequestMapping(method = RequestMethod.GET)
    public String sayWelcome(ModelMap modelMap){
        return "welcome";
    }
}
