package com.efo.s.spring.cache.example.loader;

import com.efo.s.spring.cache.example.model.Users;
import com.efo.s.spring.cache.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
@Component
public class Loader {

    private final UsersRepository usersRepository;

    @Autowired
    public Loader(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostConstruct
    public void load(){
        usersRepository.save(getList());
    }

    private List<Users> getList(){
        return Arrays.asList(new Users("Anna Lu","LF",30L),new Users("Jack","efo",40L));
    }

}
