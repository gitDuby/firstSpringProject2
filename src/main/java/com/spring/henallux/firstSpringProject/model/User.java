package com.spring.henallux.firstSpringProject.model;


import javax.validation.constraints.*;

public class User {

    @Size(min=4, max=15)
    private String name;

    @NotNull
    @Min(value=1)
    @Max(value=12)
    private Integer age;

    private Boolean male;

    private String hobby;

    public User( ) {
    }


    public User(String name, Integer age, Boolean male, String hobby) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public String toString() {
        return "UserForm [name=" + name + ", age=" + age + ", male=" + male + ", hobby=" + hobby + "]";
    }

}

