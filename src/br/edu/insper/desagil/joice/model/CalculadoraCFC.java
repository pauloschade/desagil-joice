package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC(String nome) {
		super(nome);
	}
	
	public double calcula(double peso, double raio) {
		double numerador = (4/3) * peso * Math.pow(raio, 3) * 4;
		double denominador = Math.pow((4 * raio) / Math.pow(2, 0.5),3);
		return numerador/denominador;
	}

}
