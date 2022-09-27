/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Miller Gee
 */
public class NoteServlet extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        Note n = new Note();
        n.setTitle(br.readLine());
        n.setContents(br.readLine());
        request.setAttribute("title", n.getTitle());
        request.setAttribute("contents", n.getContents());
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);


    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");

    }

   

}
