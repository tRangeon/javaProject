package projet;

/**
 * Classe qui contient le main
 * 
 * @author Thomas
 */
public class Projet {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("---------- Debut du jeu --------");

		// Creation du Maitre du jeu et du joueur
		MaitreDuJeu maitreDuJeu = new MaitreDuJeu();
		Joueur joueur = maitreDuJeu.CreerJoueur();
		maitreDuJeu.setJoueur(joueur);

		// Chargement du scenario
		Scenario scenario = new Scenario(joueur, maitreDuJeu);
		
		//Ecriture du fichier soluce
		EcritureAstuce ecritureAstuce=new EcritureAstuce(maitreDuJeu);
      		ecritureAstuce.ecrire();
      		
		// Lancement du jeu
		while ((maitreDuJeu.getVictoire() != 0) && (maitreDuJeu.getVictoire() != 1)) {
			maitreDuJeu.jouerUnTour();
		}
		maitreDuJeu.jouerUnTour();

	}

}
