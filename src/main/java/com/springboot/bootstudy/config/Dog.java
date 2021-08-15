package com.springboot.bootstudy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//加载指定的properties
@PropertySource(value = "classpath:dog.properties")
public class Dog {

    //    @Value("传统赋值旺财") // 字面量
    @Value("${name}") //从配置文件中读
    private String name;

    //    @Value("12")
    @Value("${age}")
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
