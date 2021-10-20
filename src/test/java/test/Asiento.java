package test;

public class Asiento {
	String color;
	int precio;
	int registro;
			
	void cambiarColor(String color) { 
		if (color == "verde" || color == "rojo"  || color == "blanco" || color == "amarillo" || color == "negro")  {
			this.color = color;
		}
	 }
}