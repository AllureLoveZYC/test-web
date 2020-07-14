package com.zyc.test;

import java.io.IOException;

/**
 * Created by zyc on 2020/7/10.
 */
@javax.servlet.annotation.WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
   protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      System.out.println("=============================");
   }

   protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      this.doPost(request,response);
   }
}
