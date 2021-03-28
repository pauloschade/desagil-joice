package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC() {
		super("CFC");
	}
	
	public double calcula(double peso, double raio) {
		double numeroAvogadro = 6.02214 * Math.pow(10,23);
		double raioCm = raio/10000000;
		double massaAtomica = 4 * peso/numeroAvogadro;
		double aresta = (Math.pow(2, 1.5) * raioCm);
		double volume = Math.pow(aresta, 3);
		return massaAtomica/volume;
	}

}
