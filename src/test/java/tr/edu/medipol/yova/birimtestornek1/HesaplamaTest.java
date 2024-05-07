package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testTopla() {
		// GIVEN
		int sayi1 = 2;
		int sayi2 = 2;

		// WHEN
		int sonuc = Hesaplama.topla(sayi1, sayi2);

		// THEN
		assertEquals(4, sonuc);
	}

	@Test
	public void testCikart() {

		// GIVEN
		int sayi1 = 4;
		int sayi2 = 3;

		// WHEN
		int sonuc = Hesaplama.cikart(sayi1, sayi2);

		// THEN;
		assertEquals(1, sonuc);
	}

	@Test
	public void testCarp() {
		// GIVEN
		int sayi1 = 5;
		int sayi2 = 2;

		// WHEN
		int sonuc = Hesaplama.carp(sayi1, sayi2);

		// THEN;
		assertEquals(10, sonuc);
	}

	@Test
	public void testBol() {
		// GIVEN
		int sayi1 = 8;
		int sayi2 = 2;

		// WHEN
		int sonuc = Hesaplama.bol(sayi1, sayi2);

		// THEN;
		assertEquals(4, sonuc);
	}

}
