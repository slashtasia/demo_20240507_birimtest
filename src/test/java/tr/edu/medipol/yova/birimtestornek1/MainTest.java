package tr.edu.medipol.yova.birimtestornek1;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
	
	@Test
	public void testMetniFormatla ( ) {
		
		//1. ON KOSULLAR (GIVEN)
		String kaynakMetin = "     ders 1    ";
		
		//2. TEST EDILECEK KOD CAGIRILDIGINDA (WHEN)
		String sonuc = Main.metniFormatla(kaynakMetin);
		
		//3. KONTROLLER (THEN)
		assertNotNull(sonuc);
		assertEquals("Ders 1",sonuc);
	}

}
