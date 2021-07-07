package com.connor.servlet;

import com.connor.bean.Students;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/json")
public class jsonServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Students student = new Students(1, "Connor", "Man", new Date(), "Eat", "shit");
        Students student1 = new Students(2, "Katy", "Woman", new Date(), "Dance", "flower");
        Students student2 = new Students(3, "Jack", "Man", new Date(), "Fucking", "porn");

        Object[] arr = new Object[]{student,student1,student2};

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(student);
        String s1 = mapper.writeValueAsString(arr);
        System.out.println(s);
        System.out.println(s1);

        resp.getWriter().print(s1);

    }
}














