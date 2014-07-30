package com.home.controller;

import com.common.controller.impl.BaseControllerImpl;
import com.common.model.MainMenu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: asankah
 * Date: 7/29/14
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomePageController extends BaseControllerImpl {

    @RequestMapping(value = "/")
    public String getHomePageView(ModelMap modelMap){
        setMainMenu(modelMap, MainMenu.HOME);
        setMetaDescription(modelMap, "homepage.meta.description");
        setMetaKeywords(modelMap, "homepage.meta.keywords");

        return "views/homePage/home";
    }

}
