package main.java.controller;

import main.java.pojo.Rank;
import main.java.pojo.Result;

import main.java.pojo.Soldiers;
import main.java.servicce.IRankService;
import main.java.servicce.ISoldierService;
import main.java.servicce.RankServiceImpl;
import main.java.servicce.SoldierServiceImpl;
import sun.plugin.dom.core.Document;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@MultipartConfig
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private ISoldierService service =  new SoldierServiceImpl();
    private IRankService service1 =new RankServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*int pageNo =req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
        int pageSize = 3;

        Result data = service.getlLists(pageNo,pageSize);
        data.setUrl("list");
        req.setAttribute("data", data);
        req.getRequestDispatcher("list.jsp").forward(req,resp);*/

        List<Soldiers> list = service.getlLists();
        req.setAttribute("list",list);

       /* List<Rank> list1 = service1.getlLists();
        req.setAttribute("list1",list1);*/
        req.getRequestDispatcher("list.jsp").forward(req,resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String text = req.getParameter("text");
        System.out.println(text);
        if (text==""||text.equals(" ")){
            List<Soldiers> list = service.getlLists();
            req.setAttribute("list",list);
            req.getRequestDispatcher("list.jsp").forward(req,resp);
        }
        else {
            List<Soldiers> list = service.getResults(text);
            req.setAttribute("list",list);
            req.getRequestDispatcher("list.jsp").forward(req,resp);
        }



    }
}
