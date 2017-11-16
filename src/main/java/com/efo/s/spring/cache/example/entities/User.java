package com.efo.s.spring.cache.example.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ${VERSION}
 * Created by jack on 2017/11/16
 *
 * 角色: 缓存对象
 *
 */
@Entity
@Table(name = "CMS_USERS")
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "TEAMNAME")
    private String teamName;
    private Long salary;

    public User(){

    }

    public User(String name, String teamName, Long salary) {
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
