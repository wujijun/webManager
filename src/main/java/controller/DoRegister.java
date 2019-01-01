package controller;


import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

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
        String Uname = req.getParameter("user1");
        String password = req.getParameter("pass");
        String password1 = req.getParameter("pass2");
        String email = req.getParameter("pass3");

        System.out.println(Uname);
        System.out.println(password);
        System.out.println(password1);
        System.out.println(email);

            User u=user.getOne(Uname);       /*去数据库里查找名字是否存在*/
        System.out.println(u);

            if (u!=null){
                resp.getWriter().write("1");      /*用户已存在*/
            }else {
                resp.getWriter().write("2");        /*可以注册*/
                if (password != "" && password1 != "") {            /*都不为空*/
                    if (password.equals(password1)) {
                        resp.getWriter().write("3");     /*正常注册*/
                    } else {
                        resp.getWriter().write("4");    /*两次密码不一样*/
                    }
                }

        }

    }
}
