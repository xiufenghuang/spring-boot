package top.xiufenghuang.mapper;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.xiufenghuang.entity.Student;


import java.util.List;

public interface StudentMapper {
    @Mapper
    int insert(Student student);
    @Mapper
    Student findStudentById(int studentId);

    @Mapper
    int updateById(Student student);
    @Mapper
    int deleteById(int studentId);
    @Mapper
    int batchInsert(@Param("students") List<Student> students);
    @Mapper
    int batchDelete(@Param("idList") List<Integer> ids);
    @Mapper
    int batchUpdate(@Param("students") List<Student> students);
    @Mapper
    List<Student> selectByDynamicSql(Student student);
    @Mapper
    /**
     * 根据学生id查询（关联查询所属班级信息）
     *
     * @param studentId 学生id
     * @return 学生信息
     */
    Student getStudentManyToOne(int studentId);
    /**
     * 根据学生id查询（关联查询出所属班级信息，所选课程信息）
     *
     * @param studentId 学生id
     * @return 学生对象
     */
    @Mapper
    Student getStudent(int studentId);
}
