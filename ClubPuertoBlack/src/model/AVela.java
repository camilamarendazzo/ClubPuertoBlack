package model;

public class AVela extends Yate {
	
	private Double alturaMastil;
	private Double superficieVelica;
	private Double superficieTotal;

	public AVela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso, Double alturaMastil, Double superficieVelica, Double superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelica = superficieVelica;
		this.superficieTotal = superficieTotal;
	}

	@Override
	public Double getPrecioDeAmarre(Yate yate) {
		Double precio = 0.00;
		Double precioPorEslora = 0.00;
		if (yate.getEslora()<=20.0) {
			precioPorEslora = 2000.00;
		} else precioPorEslora = 3000.00;
		precio = 9000.00 + precioPorEslora;
		return precio;
	}

}
