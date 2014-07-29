package com.login.service;

import com.login.dao.UserDAO;
import com.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/24/14
 * Time: 5:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class RepositoryUserDetailsService implements UserDetailsService {


    private UserDAO repository;

    @Autowired
    public RepositoryUserDetailsService(UserDAO repository) {
        this.repository = repository;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("No user found with username: " + username);
        }
        com.login.model.UserDetails principle = new com.login.model.UserDetails.Builder().firstName(user.getFirstName())
                .lastName(user.getLastName())
                .id(user.getId()).password(user.getPassword()).role(user.getRole())
                .socialMediaProvider(user.getSignInProvider()).username(user.getEmail()).build();
        return principle;

    }
}
