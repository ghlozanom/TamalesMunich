package com.gabloz.tamalmunich.web.helper;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gabloz.tamalmunich.web.session.UsuarioDeSesion;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

/**
 * Provides helper methods to work with in the "Web" layer 
 * 
 * @author      Gabriel Lozano
 * */
public class WebHelper {
	
	private static WebHelper webHelper = null;
	
	private static final Logger logger = 
		Logger.getLogger(WebHelper.class.getCanonicalName());

	public static final String HOME_PAGE = "/pages/index.jsp";
	
	public static final String LOGIN_PAGE = "/pages/login.jsp";	

	public static final String USUARIO_DE_SESION = "usuarioDeSesion";

	public static final String USUARIO_REGISTRADO = "usuarioRegistrado";

	public static final String CREATE_USER = "/createUser";
	
	public static final String EXISTS_SUCCESS_MESSAGE = "existSuccessMessage";
	public static final String SUCCESS_MESSAGE = "successMessage";

	public static final String LOGOUT_URL = "/logout";

	
	/**
	 * Returns a unique instance of this class (Singleton pattern)
	 * 
	 * @return a singleton BlobHelper instance
	 */
	public static WebHelper getInstance() {
		if(webHelper == null ){
			webHelper = new WebHelper();
		}
		return webHelper;
	}	
	
	/**
	 * Only accessible from the same class (Singleton pattern)
	 */
	private WebHelper(){
	}

	public static UsuarioDeSesion getUsuarioDeSesion(HttpServletRequest req) {
		
		HttpSession sesionDeUsuario = req.getSession();
		UsuarioDeSesion usuarioDeSesion = (UsuarioDeSesion) sesionDeUsuario.getAttribute(WebHelper.USUARIO_DE_SESION);
		
		UserService userService = UserServiceFactory.getUserService();
		User usuario = userService.getCurrentUser();
		
		if(usuarioDeSesion == null && usuario != null){
			usuarioDeSesion = new UsuarioDeSesion();
			usuarioDeSesion.setNombreParaMostrar(usuario.getNickname());
			usuarioDeSesion.setRegistradoConGoogle(true);
			
			sesionDeUsuario.setAttribute(WebHelper.USUARIO_DE_SESION, usuarioDeSesion);
		}
		
		return usuarioDeSesion;
	}

	public static void logoutUser(HttpServletRequest req) {
		
		HttpSession sesionDeUsuario = req.getSession();
		sesionDeUsuario.removeAttribute(WebHelper.USUARIO_DE_SESION);
		
	}

}
