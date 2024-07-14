/*
 * Copyright 2023 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mydistance;

import com.mydistance.util.ConversionUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author hp
 */
public class DistanceServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    static Logger log = Logger.getLogger(DistanceServlet.class);

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        double convertVal = 0;
        double distanceProvided = Double.parseDouble(request.getParameter("distance"));
        String distanceIn = request.getParameter("distIn");
        String convertTo = request.getParameter("convert");
        log.debug("Request Parameters ==>"+"Distance-"+distanceProvided+distanceIn+" Conversion Unit- "+convertTo);
        
        ConversionUtil conversion= new ConversionUtil();
        if(distanceIn.equals("km") && convertTo.equals("yd")){
            convertVal=conversion.convertkmToYard(distanceProvided);
        }
        
        if(distanceIn.equals("m") && convertTo.equals("yd")){
            convertVal=conversion.convertMtoYard(distanceProvided);
        }
        
        if(distanceIn.equals("km") && convertTo.equals("mi")){
            convertVal=conversion.convertKMToMile(distanceProvided);
        }

        if(distanceIn.equals("m") && convertTo.equals("mi")){
            convertVal=conversion.convertMToMile(distanceProvided);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>The converted value is " + convertVal + "</h1>");
            out.flush();
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
