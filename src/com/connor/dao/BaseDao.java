package com.connor.dao;

import com.connor.bean.Students;
import com.connor.util.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BaseDao {

    private static QueryRunner runner = new QueryRunner(ConnectionUtil.getDataSource());
    public static List<Students> getStudentBySname(String sname){

        String sql = "select * from stu where sname like concat(concat('%', ?), '%')";
        List<Students> list = null;
        try {
            list = runner.query(sql, new BeanListHandler<Students>(Students.class),sname);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}












