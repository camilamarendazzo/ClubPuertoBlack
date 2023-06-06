package model;

import java.util.Iterator;
import java.util.LinkedList;

public class Fondeadero {
	
	private LinkedList <Yate>amarras;
	private Integer cantidadDeAmarrasMaxima;

	public Fondeadero(Integer cantidadDeAmarrasMaxima) {
		amarras = new LinkedList<Yate>();
		this.cantidadDeAmarrasMaxima = cantidadDeAmarrasMaxima;
	}
	
	public void amarrarYate(Yate yate) {
		if (amarras.size()<this.cantidadDeAmarrasMaxima){
			amarras.add(yate);
		}
	}
	
	public void desamarrarYate (Yate yate) {
		amarras.remove(yate);
	}
	
	public Integer getCantidadDeYatesAmarrados() {
		return amarras.size();
	}
	
	public Integer getCantidadDeAmarrasDisponibles () {
		Integer amarrasDisponibles = 0;
		amarrasDisponibles = this.cantidadDeAmarrasMaxima - amarras.size();
		return amarrasDisponibles;
	}
	
	public Double getRecaudacionTotal() {
		Double recaudacionTotal = 0.00;
		Iterator<Yate> i = amarras.iterator();
		while (i.hasNext()){
			Yate yate = i.next();
			recaudacionTotal += yate.getPrecioDeAmarre(yate);
		}
		return recaudacionTotal;
	}

}
