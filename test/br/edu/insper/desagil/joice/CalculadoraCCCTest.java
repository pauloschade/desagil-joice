package br.edu.insper.desagil.joice;

import org.junit.jupiter.api.BeforeEach;

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
		densidade=calculatorCCC.calcula()
	}
	
}
