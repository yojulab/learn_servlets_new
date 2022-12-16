package com.yojulab.learn_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.learn_servlets.DatasInfor;
import com.yojulab.learn_servlets.beans.MemberBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/tablesBeanListServlets")
public class TablesBeanListServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
            
        DatasInfor datasInfor = new DatasInfor();
        MemberBean memberBean = datasInfor.getDataWithMamberBean();

        // Display areas
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("    <meta charset='UTF-8'>");
        printWriter.println("    <title>Tables Bean List Servlets</title>");
        printWriter.println("    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'");
        printWriter.println("        integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>");
        printWriter.println("    <link rel='stylesheet' href='./css/commons.css'>");
        printWriter.println("</head>");
        
        printWriter.println("<body>");
        printWriter.println("    <div class='container'>");
        printWriter.println("        <div class='fs-3'>Tables with Bean</div>");
        printWriter.println("<div class='fs-4'>"+memberBean.getFirstName() + " " + memberBean.getSecondName() 
                            + " " + memberBean.getHandleName()+"</div>");

        printWriter.println("        <table class='table'>");
        printWriter.println("            <thead>");
        printWriter.println("                <tr>");
        printWriter.println("                    <th scope=>#</th>");
        // printWriter.println("                    <th scope=>First</th>");
        // printWriter.println("                    <th scope=>Last</th>");
        printWriter.println("                    <th scope=>Handle</th>");
        printWriter.println("                </tr>");
        printWriter.println("            </thead>");
        printWriter.println("            <tbody>");
        printWriter.println("            </tbody>");
        printWriter.println("        </table>");
        printWriter.println("    </div>");
        printWriter.println("    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("        integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("        crossorigin='anonymous'></script>");
        printWriter.println("</body>");
        printWriter.println("</html>   ");     
        printWriter.close();
    }
}
