package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@MultipartConfig
@WebServlet("/img")
public class ImgServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("file");
        System.out.println(part.getSubmittedFileName());
        File file =new File("H:\\JAVA学习\\web视频\\12-18\\"+part.getSubmittedFileName());
        OutputStream ou = new FileOutputStream(file);
        byte []b = new byte[1024];
        InputStream is = part.getInputStream();
        int a = is.read(b,0,b.length);
        while (a!=-1){
            ou.write(b);
            a= is.read(b,0,b.length);
        }


    }
}
