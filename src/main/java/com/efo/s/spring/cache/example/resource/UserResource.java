package com.efo.s.spring.cache.example.resource;

import com.efo.s.spring.cache.example.cache.UsersCache;
import com.efo.s.spring.cache.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@RestController
@RequestMapping(value = "/rest/search")
public class UserResource {


    private final UsersCache usersCache;

    @Autowired
    public UserResource(UsersCache usersCache) {
        this.usersCache = usersCache;
    }

    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }

}
