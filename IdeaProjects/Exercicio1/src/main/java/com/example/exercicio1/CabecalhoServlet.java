package com.example.exercicio1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "CabecalhoServlet", value = "/cabecalho")
public class CabecalhoServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        String host = req.getHeader("Host");
        String userAgent = req.getHeader("User-Agent");
        String acceptEncoding = req.getHeader("Accept-Encoding");
        String acceptLanguage = req.getHeader("Accept-Language");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h3>Host: " + host + "</h3>");
        out.println("<h3>User-Agent: " + userAgent + "</h3>");
        out.println("<h3>Accept-Encoding: " + acceptEncoding + "</h3>");
        out.println("<h3>Accept-Language: " + acceptLanguage + "</h3>");
        out.println("</body></html>");
    }
}