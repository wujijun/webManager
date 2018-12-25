package main.java.controller;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    servicce.ISoldierService service  = new servicce.SoldierServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        service.delete(id);
        resp.sendRedirect("list");
    }
}
