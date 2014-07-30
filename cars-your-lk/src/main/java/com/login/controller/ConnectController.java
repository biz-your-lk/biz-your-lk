package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;

/**
 * Created with IntelliJ IDEA.
 * User: asankah
 * Date: 7/29/14
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is the controller handle all the request regarding to the connect to the Social Providers
 */
public class ConnectController extends org.springframework.social.connect.web.ConnectController {

    @Autowired
    public ConnectController(ConnectionFactoryLocator connectionFactoryLocator, ConnectionRepository connectionRepository) {
        super(connectionFactoryLocator, connectionRepository);

    }
}
