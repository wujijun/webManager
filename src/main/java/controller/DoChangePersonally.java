package controller;

import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
@MultipartConfig
@WebServlet("/doChange")
public class DoChangePersonally extends HttpServlet {
    private IUserDao service = new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        int id = Integer.parseInt(req.getParameter("id"));

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

        User u = new User();
        u.setImg(url);
        u.setPassword(password);
        u.setEmail(email);
        u.setName(name);
        u.setId(id);
        service.update(u);
        resp.sendRedirect("personally");
    }
}
