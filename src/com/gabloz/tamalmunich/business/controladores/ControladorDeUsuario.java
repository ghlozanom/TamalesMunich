package com.gabloz.tamalmunich.business.controladores;

import java.util.Date;

import com.gabloz.tamalmunich.business.dto.ContactMessage;
import com.gabloz.tamalmunich.business.dto.Usuario;
import com.gabloz.tamalmunich.business.helpers.EMailHelper;
import com.gabloz.tamalmunich.common.TamalesEnMunichConstants;
import com.gabloz.tamalmunich.model.dao.UsuarioDAO;

public class ControladorDeUsuario {
	
	private static ControladorDeUsuario controladorDeUsuario;
	
	private ControladorDeUsuario(){
		
	}
	
	public static ControladorDeUsuario getInstance(){
		if(controladorDeUsuario == null ){
			controladorDeUsuario = new ControladorDeUsuario();
		}
		return controladorDeUsuario;
	}
	
	public void registrarUsuario(Usuario usuario, boolean comprobarEmailUsuario){
		
		Date fechaDeCreacion = new Date();
		usuario.setActivo(!comprobarEmailUsuario);
		usuario.setAdmin(false);
		usuario.setFechaDeCreacion(fechaDeCreacion);
		
		UsuarioDAO.getInstance().saveUsuario(usuario);
		
		if(comprobarEmailUsuario){
			ContactMessage contactMessage = new ContactMessage();
			contactMessage.setEmail(usuario.getEmail());
			contactMessage.setFromEmail(TamalesEnMunichConstants.EMAIL_ADDRESS);
			contactMessage.setFromEmailNickname(TamalesEnMunichConstants.EMAIL_ADDRESS_NICKNAME);
			contactMessage.setSubject("Usuario " + usuario.getNombreParaMostrar() + 
					" en Tamal y mas!");
			contactMessage.setMessage("Gracias por registrarse en Tamal y mas. Para completar su registro," +
					" por favor haga clic en este link: http://tamalymas.appspot.com/au?code=" + 
					fechaDeCreacion.getTime() + " .\n\n Cordialmente, \n\nEl equipo de Tamal y mas");
			
			EMailHelper.getInstance().sendMessage(contactMessage);
			
		}
		
	}
}
