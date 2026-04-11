package com.trips.models;

public class Perfil {
	
	private Integer id;
	private String nomPerfil;
	private String descrripcion;
	private boolean activo;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomPerfil() {
		return nomPerfil;
	}
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}
	public String getDescrripcion() {
		return descrripcion;
	}
	public void setDescrripcion(String descrripcion) {
		this.descrripcion = descrripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	

}
