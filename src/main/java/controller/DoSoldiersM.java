package main.java.controller;

import main.java.dao.IRankDao;
import main.java.pojo.Rank;
import main.java.pojo.Soldiers;
import main.java.servicce.IRankService;
import main.java.servicce.ISoldierService;
import main.java.servicce.RankServiceImpl;
import main.java.servicce.SoldierServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/soldiersM")
public class DoSoldiersM extends HttpServlet {
    private ISoldierService service1=new SoldierServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String rank = req.getParameter("rank");
        System.out.println(rank);
        List<Soldiers> list1 = service1.getlList(rank);
        System.out.println(list1);
        req.setAttribute("list1",list1);
        req.getRequestDispatcher("soldiersM.jsp").forward(req,resp);

    }
}
