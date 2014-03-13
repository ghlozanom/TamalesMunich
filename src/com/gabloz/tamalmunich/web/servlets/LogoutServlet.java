package com.gabloz.tamalmunich.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gabloz.tamalmunich.web.helper.WebHelper;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		WebHelper.logoutUser(req);
		RequestDispatcher jsp = req.getRequestDispatcher("/");
		jsp.forward(req, resp);			
		
	}
	
}
