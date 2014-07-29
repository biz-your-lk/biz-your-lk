package com.login.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.security.SocialUser;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: asankah
 * Date: 7/23/14
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDetails extends SocialUser {

    private Long id;
    private String firstName;
    private String lastName;
    private Role role;
    private SocialMediaService socailMediaService;

    public UserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public static class Builder {
        private Long id;
        private String username;
        private String password;
        private Set<GrantedAuthority> authorities;
        private String firstName;
        private String lastName;
        private Role role;
        private SocialMediaService socailMediaService;


        public Builder() {
            this.authorities = new HashSet<GrantedAuthority>();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder role(Role role) {
            this.role = role;
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
            this.authorities.add(authority);
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder socialMediaProvider(SocialMediaService socialMediaService) {
            this.socailMediaService = socialMediaService;
            return this;
        }

        public UserDetails build() {
            UserDetails user = new UserDetails(username, password, authorities);
            user.id = id;
            user.firstName = firstName;
            user.lastName = lastName;
            user.role = role;
            user.socailMediaService = socailMediaService;
            return user;

        }

    }
}
