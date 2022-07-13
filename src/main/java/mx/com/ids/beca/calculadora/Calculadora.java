package mx.com.ids.beca.calculadora;

public class Calculadora {
	private static Calculadora c;
	
	public static Calculadora getInstance() {
		if (c == null) {
			c = new Calculadora();
			System.out.println("Creando Calculadora");
		}
		//validar parametros
		//Reutilizar instancias
		//Evitar que lo invoquen usuarios desconocidos
		return c;
	}

	public int add(int i, int j) {
		return i + j;
	}


}
