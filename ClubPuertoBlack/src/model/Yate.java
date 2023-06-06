package model;

import java.util.LinkedList;
import java.util.Iterator;

public abstract class Yate {
	
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Double peso;

	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}
	
	public abstract Double getPrecioDeAmarre (Yate yate);

	public Double getEslora() {
		return eslora;
	}
	
	

}
