package com.example.spring_boot_thymeleaf_test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: aimiguo
 * @Date: 2018/12/5
 * @Time: 17:10
 * Description:
 */
@WebServlet("/hello/*")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        // 向客户端生成响应数据
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter w = response.getWriter();
        w.println("<h1 style='text-align:center;color:blue;'>Hello, Servlet!</h1>");
    }
}
