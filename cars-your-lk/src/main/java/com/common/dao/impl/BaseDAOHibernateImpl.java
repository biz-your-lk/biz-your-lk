package com.common.dao.impl;

import com.common.dao.BaseDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/19/14
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseDAOHibernateImpl extends HibernateDaoSupport implements BaseDAO {
    //Hibernate impl uses hibernate session factory
    private SessionFactory sessionFactory;

    public BaseDAOHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        setSessionFactory(sessionFactory);
    }

    /**
     * save the object using hibernate. update the object if already exists in db.
     *
     * @param object
     * @param <E>
     */
    public <E> void saveObject(E object) {
        Session session = getSession();
        if (logger.isDebugEnabled()) {
            logger.debug("save or update object :" + object.toString());
        }
        session.save(object);
        releaseSession(session);
    }

    public <E> E getObject(Class<E> claz, Serializable id) {
        Session session = getSession();
        if (logger.isDebugEnabled()) {
            logger.debug("Start to retrieve the object :" + claz + "with ID :" + id);
        }
        E retrievedObject = (E) session.get(claz, id);
        if (retrievedObject != null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Successfully retrieved object :" + retrievedObject);
            }
            return retrievedObject;
        }
        if (logger.isDebugEnabled()) {
            logger.debug("No object found with ID : " + id);
        }
        return null;
    }
}
