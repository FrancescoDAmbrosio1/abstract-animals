package org.lessons.java.abstractanimals;

public class Passerotto extends Animale implements IVolante{

	public Passerotto() {
		this.nome = "Passerotto";
		this.verso = "Pio Pio";
		this.alimentazione = "Vegetariano";
	}

	@Override
	public void verso() {
		System.out.printf("\nCiao sono il " + nome + ". Il mio verso è %s", getVerso());
		
	}

	@Override
	public void mangia() {
		System.out.printf("\nMangio solo fibre perché sono %s ", getAlimentazione());
		
	}
	
	public String getVerso() {
		return verso;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
	
}
