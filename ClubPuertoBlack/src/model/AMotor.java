package model;

public class AMotor extends Yate{
	
	 private Integer desplazamiento;
	 private Integer potencia;
	 private Integer velocidad;
	 private Integer autonomia;

	public AMotor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso, Integer desplazamiento, Integer potencia, Integer velocidad, Integer autonomia) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	@Override
	public Double getPrecioDeAmarre(Yate yate) {
		Double precio = 0.00;
		Double precioPorEslora = 0.00;
		if (yate.getEslora()<=20.0) {
			precioPorEslora = 2000.00;
		} else precioPorEslora = 3000.00;
		precio = 10000.00 + precioPorEslora;
		return precio;
	}

}
