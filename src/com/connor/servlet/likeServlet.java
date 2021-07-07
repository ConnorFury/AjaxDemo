package com.connor.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/likeServlet")
public class likeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer count = (Integer) context.getAttribute("count");

        if (count == null){
            count = 1;
        }else{
            count++;
        }
        context.setAttribute("count",count);
        resp.getWriter().print(count);
    }

}
