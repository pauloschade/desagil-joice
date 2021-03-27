package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraCCCTest {
	
	private CalculadoraCCC calculatorCCC;
	private double  densidade;
	private static double DELTA=0.05;
	
	@BeforeEach
	public void setUp() {
		calculatorCCC= new CalculdadoraCCC();
	}
	
	@Test
	public void testNiobio() {
		calculatorCCC=new CalculadoraCCC("Niobio")
		densidade=calculatorCCC.calcula(92.91,0.143);
		assertEquals(8.57,densidade,DELTA);
	}
	
	@Test
	public void testTungstenio() {
		calculatorCCC=new CalculadoraCCC("Tungstenio")
		densidade=calculatorCCC.calcula(183.84,0.137);
		assertEquals(19.28,densidade,DELTA);
	}
	
	@Test
	public void testLitio() {
		calculatorCCC=new CalculadoraCCC("Litio")
		densidade=calculatorCCC.calcula(6.94,0.152);
		assertEquals(0.53,densidade,DELTA);
	}
	
}