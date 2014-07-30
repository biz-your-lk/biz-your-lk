package com.common.controller.impl;

import com.common.controller.BaseController;
import com.common.model.MainMenu;
import org.springframework.ui.ModelMap;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/20/14
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class BaseControllerImpl implements BaseController {

    public void setMainMenu(ModelMap model, MainMenu mainMenu) {
        model.addAttribute("mainMenu", mainMenu.toString());
    }

    public void setMetaDescription(ModelMap model, String metaDecKey) {
        model.addAttribute("metaDescription", metaDecKey);
    }

    public void setMetaKeywords(ModelMap model, String metaKeywordsKey) {
        model.addAttribute("metaKeywords", metaKeywordsKey);
    }

    public void setTitle(ModelMap model, String titleKey) {
        model.addAttribute("title", titleKey);
    }
}
