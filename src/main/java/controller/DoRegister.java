package main.java.controller;

import main.java.dao.IUserDao;
import main.java.dao.UserDaoImpl;
import main.java.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
    private IUserDao user = new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String names = req.getParameter("Uname");
        String password = req.getParameter("Upassword1");
        String password1 = req.getParameter("Upassword2");
        String email = req.getParameter("Uemail");

        System.out.println(names);
        System.out.println(password);
        System.out.println(password1);
        System.out.println(email);

        if (names.matches("[ ]*")) {    /*名字是空*/
            resp.getWriter().write("0");    /*请输入用户名*/
        }
        else {
            User u=user.getOne(names);       /*去数据库里查找名字是否存在*/

            if (u!=null){
                resp.getWriter().write("1");      /*用户已存在*/
            }else {
                resp.getWriter().write("2");        /*可以注册*/
                if (password!=""&&password1!=""){            /*都不为空*/
                    if (password.equals(password1)){
                        resp.getWriter().write("3");     /*正常注册*/
                    }else {
                        resp.getWriter().write("4");    /*两次密码不一样*/
                    }
                }

        }
    }
    }
}
