package com.common.controller;

import com.common.model.MainMenu;
import org.springframework.ui.ModelMap;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/20/14
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public interface BaseController {

    /**
     * set the main menu attribute to the the given model.
     * This main menu attribute will use to resolve the selected main menu class in the front end
     *
     * @param model
     * @param mainMenu
     */
    public void setMainMenu(ModelMap model, MainMenu mainMenu);

    /**
     * set the meta description key for the model
     * @param model
     * @param metaDecKey
     */
    public void setMetaDescription(ModelMap model, String metaDecKey);

    /**
     * set the meta keywords key for the model.
     * @param model
     * @param metaKeywordsKey
     */
    public void setMetaKeywords(ModelMap model, String metaKeywordsKey);

    /**
     * Set the dynamic title for page
     * @param model
     * @param titleKey
     */
    public void setTitle(ModelMap model, String titleKey);
}
