package com.login.dao;

import com.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/25/14
 * Time: 12:55 AM
 * To change this template use File | Settings | File Templates.
 */

public interface UserDAO {

    public User findByEmail(String email);

}
