package com.gabloz.tamalmunich.model.dao;

import com.gabloz.tamalmunich.business.dto.Usuario;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class UsuarioDAO {
	
	private static UsuarioDAO instance = null;
	private DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
	public static UsuarioDAO getInstance(){
		if(instance == null ){
			instance = new UsuarioDAO();
		}
		return instance;
	}
	
	private UsuarioDAO(){
		
	}

	public void saveUsuario(Usuario usuario) {
		
		Entity usuarioEntity = new Entity("Usuario");
		usuarioEntity.setProperty("admin", usuario.isAdmin());
		usuarioEntity.setProperty("email", usuario.getEmail());
		usuarioEntity.setProperty("nombreParaMostrar", usuario.getNombreParaMostrar());
		usuarioEntity.setProperty("contrasena", usuario.getContrasena());
		usuarioEntity.setProperty("fechaDeCreacion", usuario.getFechaDeCreacion());
		usuarioEntity.setProperty("activo", usuario.isActivo());
		
		ds.put(usuarioEntity);
	}

}
