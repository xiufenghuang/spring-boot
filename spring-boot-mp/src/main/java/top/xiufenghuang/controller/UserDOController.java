package top.xiufenghuang.controller;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xiufenghuang.entity.UserDO;
import top.xiufenghuang.mapper.UserMapper;
/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/2 10:28
 * @author hxf13
 */
@RestController
@RequestMapping("go")
public class UserDOController {
    @Resource
    private UserMapper mapper;
    @GetMapping("{id}")
    public void insert(@PathVariable("id") Integer id){
        UserDO userDO = new UserDO().setId(id).setUsername("华盛顿").setPhone("1332923311").setGender("男");
        mapper.insert(userDO);
    }
}
