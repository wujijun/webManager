package dao;


import pojo.User;
import tools.util.JDBCUtil;
import tools.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into user(id,name,password,email,img) value(?,?,?,?,?)",
                user.getId(),user.getName(),user.getPassword(),user.getEmail(),user.getImg());
    }

    @Override
    public int update(User user) {
        return JDBCUtil.executeUpdate("update user set name =?, password =?, email =?, img =? where id = ?",
                user.getName(),user.getPassword(),user.getEmail(),user.getImg(),user.getId());
    }

    @Override
    public User getOne(String Uname) {
        return JDBCUtil.getOne("select * from user where name = ?", new RowMap<User>() {
            @Override
            public User RowMaping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("name"));
                    u.setPassword(rs.getString("password"));
                    u.setEmail(rs.getString("email"));
                    u.setImg(rs.getString("img"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println(u);
                return u;
            }
        }, Uname);
    }
}
