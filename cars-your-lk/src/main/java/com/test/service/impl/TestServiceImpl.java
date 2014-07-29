package com.test.service.impl;

import com.test.dao.TestDAO;
import com.test.model.TestModel;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/19/14
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestServiceImpl implements TestService {


    TestDAO testDAO;

    public void saveTestModel(TestModel testModel) {
        testDAO.saveObject(testModel);
    }

    public TestModel getTestModelById(Long id) {
        return testDAO.getObject(TestModel.class, id);
    }


    // Getters and Setters

    public TestDAO getTestDAO() {
        return testDAO;
    }

    public void setTestDAO(TestDAO testDAO) {
        this.testDAO = testDAO;
    }
}
