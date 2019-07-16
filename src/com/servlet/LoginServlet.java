package com.servlet;

import com.dao.UserDao;
import com.entity.User;
import com.mysql.cj.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "loginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        UserDao userDao=new UserDao();
        List<User> list = userDao.findUser();
        PrintWriter out=resp.getWriter();

        HttpSession session = req.getSession();

        for (int i=0;i<list.size();i++){
            if (username.equals(list.get(i).getUsername())){
                if (pwd.equals(list.get(i).getPassword())){
                    resp.sendRedirect("index.jsp");
                }
            }else {
               continue;
            }


        }
        //req.getRequestDispatcher("login.jsp").forward(req,resp);






    }
}
