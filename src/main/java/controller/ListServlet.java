package controller;

import com.alibaba.fastjson.JSONObject;
import pojo.Result;
import pojo.Soldiers;
import pojo.User;
import servicce.ISoldierService;
import servicce.SoldierServiceImpl;
import tools.util.CookieUtil;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private ISoldierService service = new SoldierServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");

        Cookie[] cookies = req.getCookies();
       Map<String,Cookie> maps = CookieUtil.getCookie(cookies);
       Cookie coo = maps.get("name");
       String name = coo.getValue();
        System.out.println(name);
       if (name==null){
           req.getRequestDispatcher("login.jsp").forward(req,resp);
       }

        HttpSession session =req.getSession();
        User u = (User)session.getAttribute("U");

       List<Soldiers> list = service.getlLists();
       String lis = JSONObject.toJSONString(list);
       resp.getWriter().write(lis);


        /*第一次访问时 分页情况*/
        int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
        int pageSize = 5;
        /*模糊查询*/
        String text = req.getParameter("text");
        if (text == "" || text == null) {
            /*list 分页条*/
            Result data = service.getlLists(pageNo, pageSize);
            data.setUrl("list", "");
            req.setAttribute("data", data);
            req.getRequestDispatcher("list.jsp").forward(req, resp);
        } else {
            Result data = service.getLists(pageNo, pageSize, text);
            String params = "&text=" + text;
            data.setUrl("list", params);
            System.out.println(text);
            req.setAttribute("text", text);
            req.setAttribute("data", data);
            req.getRequestDispatcher("list.jsp").forward(req, resp);
        }



        /*int pageNo =req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
        int pageSize = 3;

        Result data = service.getlLists(pageNo,pageSize);
        data.setUrl("list");
        req.setAttribute("data", data);
        req.getRequestDispatcher("list.jsp").forward(req,resp);*/

      /*  List<Soldiers> list = service.getlLists();
        req.setAttribute("list", list);

        req.getRequestDispatcher("list.jsp").forward(req, resp);*/
    }

/*
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
}*/



public static Map<String, Cookie> getCookie(Cookie[] cookies){
    Map<String,Cookie> maps = new HashMap<>();
    if (cookies!=null){
        for (Cookie coo:cookies
        ) {
            maps.put(coo.getValue(),coo);
        }
    }
    return maps;
}
}

