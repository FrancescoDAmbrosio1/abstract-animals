package org.lessons.java.abstractanimals;

public class Cane extends Animale implements INuotante{
	
	public Cane() {	
		this.nome = "Cane";
		this.verso = "Bau Bau";
		this.alimentazione = "Onnivoro";
	}

	@Override
	public void verso() {
		System.out.printf("\nCiao sono il " + nome + ". Il mio verso è %s", getVerso());
	}

	@Override
	public void mangia() {
		System.out.printf("\nMangio di tutto perché sono %s ", getAlimentazione());
	}
	
	public String getVerso() {
		return verso;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
		
	}
	
}
