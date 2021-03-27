package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	
	private CalculadoraCFC calculatorCFC;
	private static double DELTA = 0.05;
	private double densidade;
		
	@Test
	void testOuro() {
		calculatorCFC = new CalculadoraCFC("ouro");
		densidade = calculatorCFC.calcula(196.97, 0.144);
		assertEquals(19.36, densidade, DELTA);
	}
	
	@Test
	void testPrata() {
		calculatorCFC = new CalculadoraCFC("prata");
		densidade = calculatorCFC.calcula(107.87, 0.144);
		assertEquals(10.60, densidade, DELTA);
	}
	
	@Test
	void testCobre() {
		calculatorCFC = new CalculadoraCFC("cobre");
		densidade = calculatorCFC.calcula(63.55, 0.128);
		assertEquals(8.89, densidade, DELTA);
	}
	

}
