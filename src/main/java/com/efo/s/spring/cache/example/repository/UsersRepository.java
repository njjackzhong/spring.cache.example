package com.efo.s.spring.cache.example.repository;


import com.efo.s.spring.cache.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
public interface UsersRepository extends JpaRepository<User,Long>{

    User findByName(String name);
}
