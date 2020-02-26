import org.junit.Test;

public class Employe_affichageTest{
	@Test()
	public void TestConstructeur() {
			
		new Employe_affichage("Bazin Sarah","adresse");
			
	}
	
	@Test()
	public void TestConstructeur2() {
			
		new Employe_affichage();
			
	}
}