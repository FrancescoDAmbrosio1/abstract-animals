package org.lessons.java.abstractanimals;

public abstract class Animale {
	
	protected String nome;
	protected String verso;
	protected String alimentazione;
	
	public Animale(){
	}
	
	public void dormi() {
		System.out.println("\nDormo.......Zzzzzzzzz");
	}
	
	public abstract void verso();
	
	public abstract void mangia();
	
}
