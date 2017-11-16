package com.efo.s.spring.cache.example.cache;

import com.efo.s.spring.cache.example.model.Users;
import com.efo.s.spring.cache.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@Component
public class UsersCache {

    private final UsersRepository usersRepository;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Autowired
    public UsersCache(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {

        System.out.println(String.format("[%s] Retrieving from database for name:%s",sdf.format(new Date()), name));
        return usersRepository.findByName(name);
    }





}
