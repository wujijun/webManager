package controller;

import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/changePersonally")
public class ChangePersonally extends HttpServlet {
    private IUserDao service = new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session =req.getSession();
        User user = (User) session.getAttribute("U");  /*从session里面去取值*/

        req.setAttribute("u",user);
        System.out.println(user);

        req.getRequestDispatcher("changePersonally.jsp").forward(req,resp);

    }
}
