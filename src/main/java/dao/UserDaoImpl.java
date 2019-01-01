package dao;


import pojo.User;
import tools.util.JDBCUtil;
import tools.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into user(id,name,password,email) value(?,?,?,?)",
                user.getUid(),user.getUname(),user.getUpassword(),user.getUemail());
    }

    @Override
    public User getOne(String Uname) {
        return JDBCUtil.getOne("select * from user where name = ?", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u = new User();
                try {
                    u.setUid(rs.getInt("id"));
                    u.setUname(rs.getString("name"));
                    u.setUpassword(rs.getString("password"));
                    u.setUemail(rs.getString("email"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println(u);
                return u;
            }
        }, Uname);
    }
}
