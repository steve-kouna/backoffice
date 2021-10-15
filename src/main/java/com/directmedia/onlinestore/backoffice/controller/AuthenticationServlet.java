/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Steve KOUNA
 */
public class AuthenticationServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login1  = "michel";
        String password1 = "123456";
        
        String login2  = "caroline";
        String password2 = "abcdef";
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if((login.equals(login1) || login.equals(login2)) && (password.equals(password1) || password.equals(password2))) {
            HttpSession session = request.getSession();
            session.setAttribute("username", login);
            
            out.print("<span>Bonjour " + (String)session.getAttribute("username") + " ( <a href='logout'>Deconnexion</a>) </span> <br>");
            out.print("le home page <a href='home.jsp'>ICI</a>");
        } else {
            out.print("<span>Desole " + login + "</span> <br>");
            out.print("Reessaye <a href='login.html'>ICI</a>");
        }
    }
}
