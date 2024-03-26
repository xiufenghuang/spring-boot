package top.xiufenghuang.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.Teacher;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TeacherMapperTest {


    @Resource
    private TeacherMapper teacherMapper;
//根据id查询教师信息，TeacherMapper.xml 中使用 association 实现一对一关联查询
    @Test
    void selectOneByOne() {
        Teacher teacher = teacherMapper.selectOneByOne(1);
        log.info(teacher.getTeacherName() + "," + teacher.getClazz().getClazzName());
    }
}