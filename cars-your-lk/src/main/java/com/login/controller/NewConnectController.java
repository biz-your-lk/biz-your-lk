package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ConnectController;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/25/14
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class NewConnectController extends ConnectController {
    @Autowired
    public NewConnectController(ConnectionFactoryLocator connectionFactoryLocator, ConnectionRepository connectionRepository) {
        super(connectionFactoryLocator, connectionRepository);
    }
}
