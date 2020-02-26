import org.junit.Test;

public class Employe_salaireTest{
	@Test()
	public void TestConstructeur() {
			
		new Employe_affichage("Bazin Sarah","adresse");
			
	}
	
	@Test()
	public void TestConstructeur2() {
			
		new Employe_affichage();
			
	}
}