package com.test.dao.impl;

import com.common.dao.impl.BaseDAOHibernateImpl;
import com.test.dao.TestDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/19/14
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDAOHibernateImpl extends BaseDAOHibernateImpl implements TestDAO {

    @Autowired
    private SessionFactory sessionFactory;

    TestDAOHibernateImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory = sessionFactory;
    }


}
