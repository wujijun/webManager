package controller;

import main.java.pojo.Result;

import servicce.ISoldierService;
import servicce.SoldierServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private ISoldierService service = (ISoldierService) new SoldierServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int pageNo =req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
        int pageSize = 3;

        Result data = service.getlLists(pageNo,pageSize);
        data.setUrl("list");
        req.setAttribute("data", data);
        req.getRequestDispatcher("list.jsp").forward(req,resp);

   /*     List<Soldiers> list = service.getlLists();
        System.out.println(list);
        req.setAttribute("list",list);
        req.getRequestDispatcher("list.jsp").forward(req,resp);*/
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String test = req.getParameter("test");
        System.out.println(test);
    }
}
