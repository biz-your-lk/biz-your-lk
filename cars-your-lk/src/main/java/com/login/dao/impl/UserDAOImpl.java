package com.login.dao.impl;

import com.common.dao.impl.BaseDAOHibernateImpl;
import com.login.dao.UserDAO;
import com.login.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/25/14
 * Time: 2:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserDAOImpl extends BaseDAOHibernateImpl implements UserDAO {

    SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory = sessionFactory;
    }

    public User findByEmail(String email) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("email", email));
        List<User> userList = criteria.list();
        if (userList != null && !userList.isEmpty()) {
            return userList.get(0);
        } else {
            return null;
        }
    }
}
