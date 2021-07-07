package com.connor.service;

import com.connor.bean.Students;
import com.connor.dao.BaseDao;

import java.util.List;

public class StudentService {

    public static List<Students> getStudentBySname(String sname){


        return BaseDao.getStudentBySname(sname);
    }

}
