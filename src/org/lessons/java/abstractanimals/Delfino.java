package org.lessons.java.abstractanimals;

public class Delfino extends Animale{
	
	public Delfino() {
		this.nome = "Delfino";
		this.verso = "Friggere o Scoppiettare";
		this.alimentazione = "Carnivoro";
	}

	@Override
	public void verso() {
		System.out.printf("\nCiao sono il " + nome + ". Il mio verso è %s", getVerso());
		
	}

	@Override
	public void mangia() {
		System.out.printf("\nMangio solo carne perché sono %s ", getAlimentazione());
		
	}
	
	public String getVerso() {
		return verso;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
}
