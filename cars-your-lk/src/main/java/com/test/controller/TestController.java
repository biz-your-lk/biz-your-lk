package com.test.controller;

import com.common.controller.BaseController;
import com.common.controller.impl.BaseControllerImpl;
import com.common.model.MainMenu;
import com.test.model.TestModel;
import com.test.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/13/14
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestController extends BaseControllerImpl {

    private final Logger logger = Logger.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test/car-for-sale-{id}")
    public String getTestView(@PathVariable int id, ModelMap modelMap) {
        TestModel testModel = new TestModel();
        testModel.setTestName("Asanka");
        testService.saveTestModel(testModel);
        setMainMenu(modelMap, MainMenu.HOME);
        modelMap.addAttribute("test", id);
        return "views/homePage/test";

    }
}
