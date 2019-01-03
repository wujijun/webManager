package controller;


import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
    IUserDao user =  new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        User u =user.getOne(name);
        if (u!=null){
            if (password.matches("[ ]*")){
                resp.getWriter().write("2");          /*请输入密码*/
                }
            else {
                if (password.equals(u.getPassword())) {


                    /*cookie*/
                    Cookie cookn = new Cookie("name",name);
                    Cookie cookp = new Cookie("password",password);
                    /*设置Cookie存活时间*/
                    cookn.setMaxAge(60*60*10);
                    cookp.setMaxAge(60*60*10);
                    resp.addCookie(cookn);
                    resp.addCookie(cookp);

                    /*session*/
                    HttpSession session = req.getSession();
                    session.setAttribute("U",u);
                    resp.getWriter().write("0");     /*登录成功*/

                } else {
                    resp.getWriter().write("1");        /*密码错误*/
                }
            }
        }else {
            resp.getWriter().write("3");                 /*用户不存在*/
        }

    }
}
