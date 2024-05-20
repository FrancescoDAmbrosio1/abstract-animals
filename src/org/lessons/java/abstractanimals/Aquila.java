package org.lessons.java.abstractanimals;

public class Aquila extends Animale implements IVolante{

	public Aquila() {	
		this.nome = "Aquila";
		this.verso = "AQUIII AQUIII";
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

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
