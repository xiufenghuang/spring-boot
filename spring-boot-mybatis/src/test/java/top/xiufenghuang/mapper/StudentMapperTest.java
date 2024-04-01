package top.xiufenghuang.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiufenghuang.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void insert() {
        Student student = Student.builder().clazzId(1).studentName("测试学生").hometown("江苏南京").birthday(LocalDate.now()).build();
        int n = studentMapper.insert(student);
        assertEquals(1, n);
    }

    @Test
    void findStudentById() {
        Student student = studentMapper.findStudentById(1003);
        assertEquals("张智康", student.getStudentName());
    }

    @Test
    void updateById() {
        Student student = Student.builder().studentId(1001).studentName("新的名字").build();
        int n = studentMapper.updateById(student);
        assertEquals(1, n);
    }

    @Test
    void deleteById() {
        int n = studentMapper.deleteById(1003);
        assertEquals(1, n);
    }
    //批量添加
    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(5000 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("江苏南京")
                    .birthday(LocalDate.now())
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchInsert(students);
        assertEquals(10, n);
    }
    //批量删除
    @Test
    void batchDelete() {
        List<Integer> idList = List.of(1001, 1004, 1005);
        int n = studentMapper.batchDelete(idList);
        assertEquals(3, n);
    }

    @Test
    void selectByDynamicSql() {
        Student student = Student.builder().hometown("州").build();
        List<Student> students = studentMapper.selectByDynamicSql(student);
        students.forEach(System.out::println);
    }
//根据学生id查询（关联查询所属班级信息）
    @Test
    void getStudentManyToOne() {
        Student student = studentMapper.getStudentManyToOne(1006);
        log.info(String.valueOf(student));
    }

    @Test
    void getStudent() {
        Student student = studentMapper.getStudent(1001);
        log.info(String.valueOf(student));
    }

    //批量更新,数据模仿批量添加
    @Test
    void batchUpdate() {
        // 创建十个学生对象的List
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(Student.builder()
                    .studentId(9000 + i)
                    .clazzId((i + 1) * 10)
                    .studentName("学生" + (i + 1))
                    .hometown("家乡" + (i + 1))
                    .birthday(LocalDate.of(2000 + i, 1, 1))
                    .build());
        }
    }
}