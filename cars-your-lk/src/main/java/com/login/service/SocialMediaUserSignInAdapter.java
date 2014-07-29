package com.login.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/26/14
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */

public class SocialMediaUserSignInAdapter implements SignInAdapter {

    public String signIn(String localUserId, Connection<?> connection, NativeWebRequest nativeWebRequest) {
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(localUserId, null, null));
        return null;
    }
}
