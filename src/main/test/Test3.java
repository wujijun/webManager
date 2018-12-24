package main.test;

import main.java.dao.UserDaoImpl;

public class Test3 {
    public static void main(String[] args) {
        UserDaoImpl u = new UserDaoImpl();
        u.getOne("machao");
    }
}
