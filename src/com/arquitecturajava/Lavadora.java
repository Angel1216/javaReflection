package com.arquitecturajava;

public class Lavadora {
private String id;
private String modelo;
private String descripcion;
private String nombre;
 
 
public Lavadora(String id, String modelo, String descripcion, String nombre) {
super();
this.id = id;
this.modelo = modelo;
this.descripcion = descripcion;
this.nombre = nombre;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getModelo() {
return modelo;
}
public void setModelo(String modelo) {
this.modelo = modelo;
}
public String getDescripcion() {
return descripcion;
}
public void setDescripcion(String descripcion) {
this.descripcion = descripcion;
}

public void setNombre(String nombre){
	this.nombre = nombre;
}

public String getNombre(){
	return this.nombre;
}

@Override
public String toString(){
	return id + " " + modelo + " " + descripcion;
}

}