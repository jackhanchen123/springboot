package com.springboot.bootstudy;

import com.springboot.bootstudy.config.Dog;
import com.springboot.bootstudy.config.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootstudyApplicationTests {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
