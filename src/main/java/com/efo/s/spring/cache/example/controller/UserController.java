package com.efo.s.spring.cache.example.controller;

import com.efo.s.spring.cache.example.cache.UsersCache;
import com.efo.s.spring.cache.example.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@RestController
public class UserController {


    private final UsersCache usersCache;

    @Autowired
    public UserController(UsersCache usersCache) {
        this.usersCache = usersCache;
    }

    @GetMapping(value = "/rest/users/{name}")
    public User getUser(@PathVariable final String name) {
        return usersCache.getUserByName(name);
    }

    @PostMapping(value = "/rest/users/set")
    public void saveUser(@RequestBody  User users){
        usersCache.saveUser(users);
    }


    @RequestMapping(value = "/rest/users/findAll")
    public List<User> findAll(){
        return usersCache.findAll();
    }

}
