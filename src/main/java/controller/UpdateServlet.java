package main.java.controller;

import main.java.pojo.Soldiers;
import main.java.servicce.ISoldierService;
import main.java.servicce.SoldierServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    ISoldierService service  = new SoldierServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        Soldiers s= service.getone(id);
        req.setAttribute("s",s);
        req.getRequestDispatcher("update.jsp").forward(req,resp);
    }
}
