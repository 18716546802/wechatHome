package com.wechat.service;

import com.wechat.entity.Student;
import com.wechat.entity.Teacher;

import java.util.List;

/**
 * @时间: 2018/4/16
 * @描述：
 */
public interface TeacherService {
    List<Student> getStudentByCid(Integer cid);
    Teacher isTeacher(Teacher teacher);
}
