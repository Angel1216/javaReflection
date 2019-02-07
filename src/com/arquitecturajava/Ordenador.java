package com.arquitecturajava;

public class Ordenador {
	 
private String id;
private String descripcion;
private int potencia;
private String nombre;

public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getDescripcion() {
return descripcion;
}
public void setDescripcion(String descripcion) {
this.descripcion = descripcion;
}
public int getPotencia() {
return potencia;
}
public void setPotencia(int potencia) {
this.potencia = potencia;
}
public Ordenador(String id, String descripcion, int potencia, String nombre) {
super();
this.id = id;
this.descripcion = descripcion;
this.potencia = potencia;
this.nombre = nombre;
}

public void setNombre(String nombre){
	this.nombre = nombre;
}

public String getNombre(){
	return this.nombre;
}

@Override
public String toString(){
	return Integer.parseInt(id) + " " + descripcion + " " + potencia;
}
 
}