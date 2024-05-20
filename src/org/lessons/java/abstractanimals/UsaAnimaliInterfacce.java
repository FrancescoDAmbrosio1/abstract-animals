package org.lessons.java.abstractanimals;

public class UsaAnimaliInterfacce {
	
	public static void main(String[] args) {
		
		IVolante aquila = new Aquila();
		faiVolare(aquila);
		
		Passerotto passero = new Passerotto();
		faiVolare(passero);
		
	}
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
	
}
