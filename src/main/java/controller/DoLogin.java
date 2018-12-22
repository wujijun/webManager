package main.java.controller;

import main.java.dao.IUserDao;
import main.java.dao.UserDaoImpl;
import main.java.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
    IUserDao user =  new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Uname = req.getParameter("username");
        String Upassword = req.getParameter("password");
        User u =user.getOne(Uname);
        if (u!=null){
            if (Upassword.matches("[ ]*")){
                resp.getWriter().write("2");          /*请输入密码*/
                }
            else {
                if (Upassword.equals(u.getUpassword())) {
                    resp.getWriter().write("0");        /*登录成功*/
                } else {
                    resp.getWriter().write("1");        /*密码错误*/
                }
            }
        }else {
            resp.getWriter().write("3");                 /*用户不存在*/
        }

    }
}
