package com.gabloz.tamalmunich.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gabloz.tamalmunich.web.helper.WebHelper;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		UserService userService = UserServiceFactory.getUserService();
		User googleUser = userService.getCurrentUser();

		/** 
		 * If the user is logged in, must be redirected to the home page
		 */
		if (googleUser != null) {
			RequestDispatcher jsp = req.getRequestDispatcher(WebHelper.HOME_PAGE);
			jsp.forward(req, resp);			
			return;
		}
		req.setAttribute("loginUrl", userService.createLoginURL(WebHelper.CREATE_USER));
		
		RequestDispatcher jsp = req.getRequestDispatcher(WebHelper.LOGIN_PAGE);
		jsp.forward(req, resp);
	}
}
