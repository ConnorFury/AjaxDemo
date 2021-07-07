package com.connor.servlet;

import com.connor.bean.Students;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/studentMsg")
public class ServletVue extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Students student = new Students(1, "Connor", "Man", null, "Eat", "shit");
        Students student1 = new Students(2, "Katy", "Woman", null, "Dance", "flower");
        Students student2 = new Students(3, "Jack", "Man", null, "Fucking", "porn");

        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(students);
        System.out.println(s);
        resp.getWriter().print(s);

    }









}





