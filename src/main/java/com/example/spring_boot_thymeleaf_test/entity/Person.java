package com.example.spring_boot_thymeleaf_test.entity;

/**
 * @Author: aimiguo
 * @Date: 2018/10/16
 * @Time: 17:23
 * Description:
 */
public class Person {

    private  String name ;

    private  Integer age;

    public Person(){

        super();
    }
    
    public Person(String name , Integer age ){

        super();
        this.age=age;
        this.name=name;

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
}
