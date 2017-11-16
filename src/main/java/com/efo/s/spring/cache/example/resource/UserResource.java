package com.efo.s.spring.cache.example.resource;

import com.efo.s.spring.cache.example.cache.UsersCache;
import com.efo.s.spring.cache.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@RestController
public class UserResource {


    private final UsersCache usersCache;

    @Autowired
    public UserResource(UsersCache usersCache) {
        this.usersCache = usersCache;
    }

    @GetMapping(value = "/rest/search/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUserByName(name);
    }

    @PostMapping(value = "/rest/save/")
    public void saveUser(@RequestBody Users  users){
        usersCache.saveUser(users);
    }
}
