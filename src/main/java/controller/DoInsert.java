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

@WebServlet("/doInsert")
public class DoInsert extends HttpServlet {
    private IUserDao service = new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String names = req.getParameter("user1");
        String password = req.getParameter("pass");
        String email = req.getParameter("pass3");
        User u = new User();
        u.setUname(names);
        u.setUpassword(password);
        u.setUemail(email);
        int re=service.insert(u);

        if (re > 0){
            resp.getWriter().write("1");          /*注册成功*/
        }

    }
}
