package main.java.dao;

import main.java.pojo.User;

public interface IUserDao {
    public int insert(User user);
    public User getOne(String Uname);
}
