package com.gymsvg.servlet;

import com.gymsvg.util.TimingUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gym-features")
public class GymFeaturesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String timing = request.getParameter("timing");

        // Check if the user chose a timing slot before 5 pm
        boolean before5PM = TimingUtil.isBefore5PM(timing);

        // Set a flag in the request attribute to display gym features in the JSP
        request.setAttribute("before5PM", before5PM);
        
        // Forward the request to the JSP
        request.getRequestDispatcher("/WEB-INF/gym-features.jsp").forward(request, response);
    }
}

