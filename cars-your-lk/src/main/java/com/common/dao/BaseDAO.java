package com.common.dao;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/19/14
 * Time: 5:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BaseDAO {

    /**
     * save a given type of object to the db.
     *
     * @param object
     * @param <E>
     */
    public <E> void saveObject(E object);

    /**
     * retreive an object from the db using itz class and id
     */
    public <E> E getObject(Class<E> claz, Serializable id);

}
