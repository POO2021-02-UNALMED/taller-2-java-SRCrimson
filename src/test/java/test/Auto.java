package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	public int cantidadAsientos() {
		int cont = 0;
		if (asientos != null) {
			for (Asiento o : asientos) {
				if (o != null) {
					cont++;
				}
			}
		}
		return cont;
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
