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
import java.util.List;

@WebServlet("/unitM")
public class DoUnitM extends HttpServlet {
    private ISoldierService service =new SoldierServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String unit = req.getParameter("unit");
        System.out.println(unit);
        List<Soldiers> list = service.getlListU(unit);
        System.out.println(list);
        req.setAttribute("list",list);
        req.getRequestDispatcher("unitM.jsp").forward(req,resp);
    }
}
