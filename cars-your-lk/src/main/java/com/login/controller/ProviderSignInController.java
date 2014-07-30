package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/26/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is the controller handle all the request in the process of signin through Social Providers
 */
@Controller
public class ProviderSignInController extends org.springframework.social.connect.web.ProviderSignInController {

    @Autowired
    public ProviderSignInController(ConnectionFactoryLocator connectionFactoryLocator, UsersConnectionRepository usersConnectionRepository, SignInAdapter signInAdapter) {
        super(connectionFactoryLocator, usersConnectionRepository, signInAdapter);
    }
}
