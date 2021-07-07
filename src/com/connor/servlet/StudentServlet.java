package com.connor.servlet;

import com.connor.bean.Students;
import com.connor.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/stu")
public class StudentServlet extends BaseServlet{

    public void completion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String sname = req.getParameter("sname");
        List<Students> list = StudentService.getStudentBySname(sname);

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(list);
        resp.getWriter().print(s);

    }

    public void asynchronous(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String flag = req.getParameter("flag");
        System.out.println(flag);
        if ("first".equals(flag)){
            ObjectMapper mapper = new ObjectMapper();
            String s = mapper.writeValueAsString("Jack");
            resp.getWriter().print(s);
        }else {
            ObjectMapper mapper = new ObjectMapper();
            String s = mapper.writeValueAsString("Rose");
            resp.getWriter().print(s);
        }
    }

}










