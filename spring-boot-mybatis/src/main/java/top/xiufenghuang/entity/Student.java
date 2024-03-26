package top.xiufenghuang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/26 14:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private LocalDate birthday;
    private Clazz clazz;
    private List<Course> courses;
}