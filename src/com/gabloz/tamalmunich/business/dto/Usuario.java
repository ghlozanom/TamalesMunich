package com.gabloz.tamalmunich.business.dto;

import java.util.Date;

/**
 * User of the application
 * 
 * @author Gabriel Lozano
 * @created 10.03.2014
 */
public class Usuario {

	private boolean admin = false;
	private String email;
	private String nombreParaMostrar;
	private String contrasena;
	private Date fechaDeCreacion;
	private boolean activo = false;	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreParaMostrar() {
		return nombreParaMostrar;
	}
	public void setNombreParaMostrar(String nombreParaMostrar) {
		this.nombreParaMostrar = nombreParaMostrar;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
