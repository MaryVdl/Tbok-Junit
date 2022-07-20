package mx.com.ids.beca.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest2 {
	
	Calculadora c;
	
	@Before
	public void inicializaCalculadora() {
		//Inicializar
		c =Calculadora.getInstance();
		System.out.println("Hello from Before");
		
	}

	@Test
	public void test_add_simple() {		
		//Actuar
		int x = c.add(1,2);
		
		//Verificar
		assertEquals(3,x);
	}
	
	@Test
	public void test_add_simple2() {
		//Actuar
		int x = c.add(8,-3);
		
		//Verificar
		assertEquals(5,x);
	}

}
