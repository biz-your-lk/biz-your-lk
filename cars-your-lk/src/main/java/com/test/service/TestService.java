package com.test.service;

import com.test.model.TestModel;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/19/14
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TestService {
    /**
     * save or update the TestModel to the db
     *
     * @param testModel
     */
    public void saveTestModel(TestModel testModel);

    public TestModel getTestModelById(Long id);
}
