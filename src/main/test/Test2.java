/*
package main.test;

import main.java.pojo.Soldiers;
import main.java.pojo.User;
import main.java.tools.util.JDBCUtil;
import main.java.tools.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {
    public User getOne(int Uid){
        return  JDBCUtil.getOne("select * from user where id=?", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u= new User();
                try {
                    u.setUid(rs.getInt("id"));
                    u.setUname(rs.getString("name"));
                    u.setUpassword(rs.getString("password"));
                    u.setUemail(rs.getString("email"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        },Uid);
    }
    public static void main(String[] args) {
        Test2 t = new Test2();

        System.out.println(t.getOne(2));
    }
}
*/
