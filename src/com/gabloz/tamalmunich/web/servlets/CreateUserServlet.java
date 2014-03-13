package com.gabloz.tamalmunich.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gabloz.tamalmunich.business.controladores.ControladorDeUsuario;
import com.gabloz.tamalmunich.business.dto.Usuario;
import com.gabloz.tamalmunich.web.helper.WebHelper;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class CreateUserServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		UserService userService = UserServiceFactory.getUserService();
		User googleUser = userService.getCurrentUser();
		Usuario usuario = null;
		boolean comprobarEmailUsuario = false;
		
		/** If the user is not logged in, she can do it with google.
		 * The following code checks if the user is logged in with google
		 */
		if (googleUser == null) {
			usuario = crearUsuario(req);
			comprobarEmailUsuario = true;
		}else{
			usuario = new Usuario();
			usuario.setEmail(googleUser.getEmail());
			usuario.setNombreParaMostrar(googleUser.getNickname());
		}
		
		ControladorDeUsuario controladorDeUsuario = ControladorDeUsuario.getInstance();
		controladorDeUsuario.registrarUsuario(usuario, comprobarEmailUsuario);
		
		sentConfirmationMessage(req, usuario);
		
		RequestDispatcher jsp = req.getRequestDispatcher(WebHelper.HOME_PAGE);
		jsp.forward(req, resp);
	}

	private void sentConfirmationMessage(HttpServletRequest req, Usuario usuario) {
		
		if(!usuario.isActivo()){
			req.setAttribute(WebHelper.EXISTS_SUCCESS_MESSAGE, true);
			req.setAttribute(WebHelper.SUCCESS_MESSAGE, "El usuario ha sido registrado. Para activarlo revise "
					+ "las instrucciones en el email " + usuario.getEmail());
		}
		
	}

	private Usuario crearUsuario(HttpServletRequest req) {
		
		Usuario usuario = new Usuario();
		String email = req.getParameter("email");
		String contrasena = req.getParameter("contrasena");
		String nombreParaMostrar = req.getParameter("nombreParaMostrar");		
		usuario.setEmail(email);
		usuario.setContrasena(contrasena);
		usuario.setNombreParaMostrar(nombreParaMostrar);
		
		return usuario;
	}	
	
}
