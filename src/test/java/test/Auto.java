package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		if (asientos.length != 0) {
			return this.asientos.length;
		}
		else {
			return 0;
		}
	}
	
	String verificarIntegridad() {
		if (asientos[0].registro == registro && registro == motor.registro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
