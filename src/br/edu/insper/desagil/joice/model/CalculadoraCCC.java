package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC(String nome) {
		super(nome);
	}
	
	public double calcula(double peso,double raio) {
		
		double numerador = (2) * peso;
		double denominador = Math.pow(((4 * raio) / Math.pow(3, 0.5)),3);
		return numerador/denominador;
	}

}
