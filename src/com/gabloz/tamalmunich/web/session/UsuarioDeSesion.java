package com.gabloz.tamalmunich.web.session;

import java.io.Serializable;

public class UsuarioDeSesion implements Serializable{
	
	private static final long serialVersionUID = -7333549187378276119L;
	private String nombreParaMostrar;
	private boolean registradoConGoogle = false;
	
	public String getNombreParaMostrar(){
		return nombreParaMostrar;
	}
	
	public void setNombreParaMostrar(String nombreParaMostrar){
		this.nombreParaMostrar = nombreParaMostrar;
	}

	public boolean isRegistradoConGoogle() {
		return registradoConGoogle;
	}

	public void setRegistradoConGoogle(boolean registradoConGoogle) {
		this.registradoConGoogle = registradoConGoogle;
	}

}
