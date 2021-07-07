package com.connor.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();

    public static DataSource getDataSource(){
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config/druid.properties");
        Properties properties = new Properties();
        DataSource dataSource = null;
        try {
            properties.load(stream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    public static Connection getConnection(){
        Connection connection = THREAD_LOCAL.get();
        if (connection == null){
            try {
                THREAD_LOCAL.set(getDataSource().getConnection());
                connection = THREAD_LOCAL.get();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

}
