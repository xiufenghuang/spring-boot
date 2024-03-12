package top.xiufenghuang.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DogTest {
    @Resource
    Dog dog;
    @Resource 
    Person person;
    @Test
    void testDog(){
        System.out.println(dog);
        System.out.println(person);
    }


}