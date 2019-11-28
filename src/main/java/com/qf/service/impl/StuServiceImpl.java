package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StudentMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.stereotype.Service;

/**
 * Author Amos
 * Creat Time 2019 11 28
 */
@Service
public class StuServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStuService {
}
