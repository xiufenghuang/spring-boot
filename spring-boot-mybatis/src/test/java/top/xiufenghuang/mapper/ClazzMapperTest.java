package top.xiufenghuang.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.Clazz;


@SpringBootTest
@Slf4j
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;
//根据班级id查询班级信息
    @Test
    void getClazzOneToMany() {
        Clazz clazz = clazzMapper.getClazzOneToMany(1);
        log.info(String.valueOf(clazz.getClazzId()));
        log.info(clazz.getClazzName());
        clazz.getStudents().forEach(student -> log.info(String.valueOf(student)));
    }
//根据id查询班级
    @Test
    void getClazz() {
        Clazz clazz = clazzMapper.getClazz(1);
        log.info(clazz.getClazzName());
        log.info(clazz.getTeacher().getTeacherName());
        clazz.getStudents().forEach(student -> log.info(student.getStudentName() + student.getHometown()));
    }
}