package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC() {
		super("CCC");
	}
	
	public double calcula(double peso,double raio) {
		double numeroAvogadro = 6.02214 * Math.pow(10,23);
		double raioCm = raio/10000000;
		double massaAtomica = (2 * peso)/numeroAvogadro;
		double numerador = (2) * peso;
		double denominador = Math.pow(((4 * raio) / Math.pow(3, 0.5)),3);
		return numerador/denominador;
	}

}
