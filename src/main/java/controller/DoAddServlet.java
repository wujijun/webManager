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
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private ISoldierService service = new SoldierServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Sname = req.getParameter("name");
        String Sage = req.getParameter("age");
        String Simg = req.getParameter("img");
        String Saddress = req.getParameter("address");
        String Sunit = req.getParameter("unit");
        String Srank = req.getParameter("rank");
        Soldiers s = new Soldiers();
        s.setName(Sname);
        s.setImg(Simg);
        s.setAddress(Saddress);
        s.setUnit(Sunit);
        s.setRank(Srank);
        service.add(s);
        resp.sendRedirect("list");
    }
}
