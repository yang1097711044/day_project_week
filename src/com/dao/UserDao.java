package com.dao;

import com.entity.User;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
        private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/shop?characterEncoding=utf8&useSSL=false&serverTimezone=CST&rewriteBatchedStatements=true";
        private static final String USER_NAME = "root";
        private static final String PASSWORD = "123456";
        public Connection getConn(){
            try {
                Class.forName(DRIVER_CLASS);
                return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;

        }
    public void closeAll(Connection conn, PreparedStatement sta, ResultSet rs){
        try {
            if(rs!=null) rs.close();
            if(sta!=null) sta.close();
            if(conn!=null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<User> findUser(){
            Connection conn=null;
            PreparedStatement prst=null;
            ResultSet rs=null;
        List<User> list=new ArrayList<>();
        try {
            conn=this.getConn();
            String sql="select username,password from user";
            prst=conn.prepareStatement(sql);
            rs=prst.executeQuery();
            while (rs.next()){
                User user=new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,prst,rs);
        }
        return list;
    }

}
