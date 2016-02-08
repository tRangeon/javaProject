package projet;

public class AfficherTexte implements Effet {

	/**
	 * Constructeur de l'effet AfficherTexte
	 */
	public AfficherTexte() {
		
	}

	/**
	 * Methode qui met en oeuvre l'effet AfficherTexte
	 * @param objet
	 */
	public void interaction(Objet objet) {
		System.out.println(objet.getParametresObjet().getAffichageTexte());
	}

}
