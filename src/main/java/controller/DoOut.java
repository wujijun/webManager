package controller;

import tools.util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/out")
public class DoOut extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Cookie[] coo =req.getCookies();
        Map<String,Cookie> maps = CookieUtil.getCookie(coo)*/
        Cookie cookie =new Cookie("name","");
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }
}
