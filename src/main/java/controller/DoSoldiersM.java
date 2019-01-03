package controller;



import pojo.Soldiers;
import servicce.ISoldierService;
import servicce.SoldierServiceImpl;

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
        List<Soldiers> list1=null;
        if (rank.equals("士兵管理")||rank.equals("干部管理")){

           resp.sendRedirect("list");
        }
        else {
            list1 = service1.getlList(rank);
            System.out.println(list1);
            req.setAttribute("list1",list1);
            req.getRequestDispatcher("soldiersM.jsp").forward(req,resp);
        }






    }
}
