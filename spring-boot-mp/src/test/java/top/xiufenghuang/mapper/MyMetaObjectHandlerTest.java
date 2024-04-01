package top.xiufenghuang.mapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.UserDO;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MyMetaObjectHandlerTest {
    @Autowired
    private UserMapper mapper;
    @Test
    public void insert() {
        UserDO user = new UserDO();
        user.setUsername("小小");
        user.setPhone("18812345678");
        user.setGender("女");
        Assertions.assertThat(mapper.insert(user)).isGreaterThan(0);
        // 成功直接拿回写的 ID
        Assertions.assertThat(user.getId()).isNotNull();
    }

}