package top.xiufenghuang.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.UserDO;
import top.xiufenghuang.mapper.UserMapper;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicePageTest{

  @Autowired
    private UserMapper mapper;


    @Test
    public void page() {
        Page<UserDO> page = new Page<>(1, 3);
        Page<UserDO> result = mapper.selectPage(page, new LambdaQueryWrapper<UserDO>().eq(UserDO::getDeleted, 0));
    }
}