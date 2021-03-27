package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	
	private CalculadoraCFC calculatorCFC;
	private static double DELTA = 0.05;
	private double densidade;
	
	@BeforeEach
	public void setUp() {
		calculatorCFC = new CalculadoraCFC;
	}
	
	@Test
	void testOuro() {
		densidade = calculatorCFC.calcula(196.97, 0.144);
		assertEquals(19.36, densidade, DELTA);
	}
	
	@Test
	void testPrata() {
		densidade = calculatorCFC.calcula(107.87, 0.144);
		assertEquals(10.60, densidade, DELTA);
	}
	
	@Test
	void testCobre() {
		densidade = calculatorCFC.calcula(63.55, 0.128);
		assertEquals(8.89, densidade, DELTA);
	}
	

}
