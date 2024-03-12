package top.xiufenghuang.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FamilyTest {
    @Resource
    Family family;
    @Test
    void testFamily(){
        System.out.println(family);
    }

}