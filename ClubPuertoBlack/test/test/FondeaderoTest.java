package test;
import model.Fondeadero;
import model.Yate;
import model.AMotor;
import model.AVela;

import static org.junit.Assert.*;

import org.junit.Test;

public class FondeaderoTest {

	@Test
	public void amarrarYDesamarrarYates() {
		Yate m = new AMotor("AZ1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, 9000, 23, 6500);
		Yate v = new AVela ("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.5, 133.0);
		Fondeadero f = new Fondeadero(70);
		f.amarrarYate(m);
		f.amarrarYate(v);
		assertEquals(2.0, f.getCantidadDeYatesAmarrados(), 0.0);
		assertEquals(68.0, f.getCantidadDeAmarrasDisponibles(),0.0);
		f.desamarrarYate(m);
		assertEquals(1.0, f.getCantidadDeYatesAmarrados(), 0.0);
		assertEquals(69.0, f.getCantidadDeAmarrasDisponibles(),0.0);
		f.desamarrarYate(v);
		assertEquals(0.0, f.getCantidadDeYatesAmarrados(), 0.0);
		assertEquals(70.0, f.getCantidadDeAmarrasDisponibles(),0.0);		
	}
	
	@Test
	public void precios() {
		Yate m = new AMotor("AZ1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, 9000, 23, 6500);
		Yate v = new AVela ("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.5, 133.0);
		Fondeadero f = new Fondeadero(70);
		f.amarrarYate(m);
		f.amarrarYate(v);
		assertEquals(13000.0, m.getPrecioDeAmarre(m),0.0);
		assertEquals(11000.0, v.getPrecioDeAmarre(v),0.0);
		assertEquals(24000.0, (m.getPrecioDeAmarre(m)+ v.getPrecioDeAmarre(v)), 0.0);
	}

}
