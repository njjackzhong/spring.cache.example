package com.efo.s.spring.cache.example.cache;

import com.efo.s.spring.cache.example.entities.User;
import com.efo.s.spring.cache.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@Component
@CacheConfig(cacheNames = "recordsCache")
public class UsersCache {

    private final UsersRepository usersRepository;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Autowired
    public UsersCache(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Cacheable( key = "#name")
    public User getUserByName(String name) {

        System.out.println(String.format("[%s] Retrieving from database for name:%s",sdf.format(new Date()), name));
        return usersRepository.findByName(name);
    }

    @CachePut(key = "#users.name")
    //清空特定缓存
    public void saveUser( User users){
        usersRepository.save(users);
    }

    @CacheEvict(value = "usersCache",allEntries = true,beforeInvocation = true)
    //清空缓存
    public void reload(){

    }

    public List<User> findAll()
    {
        return usersRepository.findAll();
    }




}
