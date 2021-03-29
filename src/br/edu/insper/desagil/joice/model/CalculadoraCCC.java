package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC() {
		super("CCC - Cúbica de Corpo Centrado");
	}
	
	public double calcula(double peso,double raio) {
		double numeroAvogadro = 6.02214 * Math.pow(10,23);
		double raioCm = raio/10000000;
		double massaAtomica = (4* peso)/numeroAvogadro;
		double aresta = (4*raioCm)/(Math.pow(3, 0.5));
		double volume =2*Math.pow(aresta, 3);
		return (massaAtomica/volume);
	}

}
