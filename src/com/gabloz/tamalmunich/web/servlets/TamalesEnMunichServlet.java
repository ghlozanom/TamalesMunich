package com.gabloz.tamalmunich.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gabloz.tamalmunich.web.helper.WebHelper;
import com.gabloz.tamalmunich.web.session.UsuarioDeSesion;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class TamalesEnMunichServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		UsuarioDeSesion usuarioDeSesion = WebHelper.getUsuarioDeSesion(req);
		UserService userService = UserServiceFactory.getUserService();

		boolean usuarioRegistrado = false;
		if(usuarioDeSesion != null ){
			usuarioRegistrado = true;
			if(usuarioDeSesion.isRegistradoConGoogle()){
				req.setAttribute("logoutUrl", userService.createLogoutURL(WebHelper.LOGOUT_URL));
			}else{
				req.setAttribute("logoutUrl", "/");
			}
		}
		req.setAttribute(WebHelper.USUARIO_REGISTRADO, usuarioRegistrado);
		
		RequestDispatcher jsp = req.getRequestDispatcher(WebHelper.HOME_PAGE);
		jsp.forward(req, resp);
	}
}
