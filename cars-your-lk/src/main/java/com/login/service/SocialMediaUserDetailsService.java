package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/25/14
 * Time: 1:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class SocialMediaUserDetailsService implements SocialUserDetailsService {

    @Autowired
    private UserDetailsService userDetailsService;

    public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException, DataAccessException {
        UserDetails userDetails = userDetailsService.loadUserByUsername(userId);
        return (SocialUserDetails) userDetails;
    }
}
