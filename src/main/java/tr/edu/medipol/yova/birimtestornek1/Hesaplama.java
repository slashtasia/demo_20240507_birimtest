package tr.edu.medipol.yova.birimtestornek1;

public class Hesaplama {

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// cikart
	
	public static int cikart(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	// carp
	
	public static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	// bol
	
	public static int bol (int sayi1, int sayi2) {
		
		if (sayi2 == 0) {
			throw new IllegalArgumentException("Sıfıra bolme hatasi: sayi2 sıfır olamaz");
		}
		return sayi1 / sayi2;
	}
}