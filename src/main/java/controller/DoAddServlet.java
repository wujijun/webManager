package controller;




import pojo.Soldiers;
import servicce.ISoldierService;
import servicce.SoldierServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@MultipartConfig
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private ISoldierService service = new SoldierServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Sname = req.getParameter("name");
        String Sage = req.getParameter("age");
        String Saddress = req.getParameter("address");
        String Sunit = req.getParameter("unit");
        String Srank = req.getParameter("rank");

        Part part = req.getPart("file");
        System.out.println(part.getSubmittedFileName());
        String str = "E:\\Users\\Administrator\\IdeaProjects\\webManager\\src\\main\\webapp\\img\\"+part.getSubmittedFileName();
        File file =new File(str);
        String url = str.substring(str.indexOf("img"));
        OutputStream ou = new FileOutputStream(file);
        byte []b = new byte[1024];
        InputStream is = part.getInputStream();
        int a = is.read(b,0,b.length);
        while (a!=-1){
            ou.write(b);
            a= is.read(b,0,b.length);
        }


        Soldiers s = new Soldiers();
        s.setName(Sname);
        s.setAge(Sage);
        s.setImg(url);
        s.setAddress(Saddress);
        s.setUnit(Sunit);
        s.setRank(Srank);
        service.add(s);
        resp.sendRedirect("list");
    }
}
