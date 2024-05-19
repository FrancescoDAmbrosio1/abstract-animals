package org.lessons.java.abstractanimals;

public class UsoAnimale {

	public static void main(String[] args) {
		Animale cane1 = new Cane();
		Animale passerotto1 = new Passerotto();
		Animale delfino1 = new Delfino();
		Animale aquila1 = new Aquila();
		
		cane1.verso();
		cane1.mangia();
		cane1.dormi();
		
		passerotto1.verso();
		passerotto1.mangia();
		passerotto1.dormi();
		
		delfino1.verso();
		delfino1.mangia();
		delfino1.dormi();
		
		aquila1.verso();
		aquila1.mangia();
		aquila1.dormi();
	}

}
