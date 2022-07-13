package mx.com.ids.beca.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test_add_simple() {
		//Inicializar
		Calculadora c = new Calculadora();		
		
		//Actuar
		int x = c.add(1,2);
		
		//Verificar
		assertEquals(3,x);
	}
	
	@Test
	public void test_add_simple2() {
		//Inicializar
		Calculadora c = new Calculadora();		
		
		//Actuar
		int x = c.add(999,1053);
		
		//Verificar
		assertEquals(2052,x);
	}

}
