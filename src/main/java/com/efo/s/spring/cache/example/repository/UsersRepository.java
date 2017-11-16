package com.efo.s.spring.cache.example.repository;

import com.efo.s.spring.cache.example.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 */
public interface UsersRepository extends JpaRepository<Users,Long>{

    Users findByName(String name);
}
