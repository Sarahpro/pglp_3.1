class Employe_affichage extends Employe {

	public Employe_affichage(String nom, String adresse) {
		super(nom, adresse);
	}
	
	public Employe_affichage() {
		super(null,null);
	}

	public void afficheCoordonnees() {System.out.println(nom+"."+adresse);}

	
}