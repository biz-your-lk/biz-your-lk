package com.login.controller;

import com.common.controller.BaseController;
import com.common.controller.impl.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/22/14
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserLoginController extends BaseControllerImpl {

    @RequestMapping(value = "/login")
    public String userLogin(@RequestParam(value = "error", required = false) String loginError,
                            @RequestParam(value = "logout", required = false) String logout, ModelMap model) {

        if (loginError != null) {
            model.addAttribute("error", "Login Failed! Username or Password is incorrect!");
        }
        if (logout != null) {
            model.addAttribute("message", "Successfully Logout");
        }
        return "views/login";
    }
}
